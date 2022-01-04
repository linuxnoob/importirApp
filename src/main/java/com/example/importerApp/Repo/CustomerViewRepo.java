package com.example.importerApp.Repo;

import com.example.importerApp.EntityView.CustomerView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
@EnableJpaRepositories
public interface CustomerViewRepo extends JpaRepository<CustomerView, Integer> {

    @Query(value = "{call sp_custom_view_customer(:name)}", nativeQuery = true)
    public List<CustomerView> findCustomView(@Param("name") String name);

    @Query(value = "{call sp_custom_view_allcustomer}", nativeQuery = true)
    public List<CustomerView> findCustomViewAll();

}
