package com.nearsoft.questions.repository;

import com.nearsoft.questions.domain.auth.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface ProfileRepository extends CrudRepository<Profile, Long> {


}
