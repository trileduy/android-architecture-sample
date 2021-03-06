package com.sample.androidarchitecture.networking.response;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.sample.androidarchitecture.data.local.entity.Repo;

import java.util.ArrayList;
import java.util.List;

public class RepoSearchResponse {

    @SerializedName("total_count")
    private int total;

    @SerializedName("items")
    private List<Repo> items;

    private Integer nextPage;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Repo> getItems() {
        return items;
    }

    public void setItems(List<Repo> items) {
        this.items = items;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    @NonNull
    public List<Integer> getRepoIds() {
        List<Integer> repoIds = new ArrayList<>();
        for (Repo repo : items) {
            repoIds.add(repo.id);
        }
        return repoIds;
    }
}