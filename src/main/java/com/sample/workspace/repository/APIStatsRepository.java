package com.sample.workspace.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.workspace.model.APIStats;

public interface APIStatsRepository extends CrudRepository<APIStats, Long> {

}
