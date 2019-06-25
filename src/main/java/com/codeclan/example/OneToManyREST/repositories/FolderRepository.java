package com.codeclan.example.OneToManyREST.repositories;

import com.codeclan.example.OneToManyREST.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
