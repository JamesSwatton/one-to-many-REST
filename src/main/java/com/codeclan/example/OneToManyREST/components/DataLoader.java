package com.codeclan.example.OneToManyREST.components;

import com.codeclan.example.OneToManyREST.models.File;
import com.codeclan.example.OneToManyREST.models.Folder;
import com.codeclan.example.OneToManyREST.models.User;
import com.codeclan.example.OneToManyREST.repositories.FileRepository;
import com.codeclan.example.OneToManyREST.repositories.FolderRepository;
import com.codeclan.example.OneToManyREST.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User michael = new User("Michael Scott");
        userRepository.save(michael);

        User dwight = new User("Dwight Schrute");
        userRepository.save(dwight);

        Folder invoices = new Folder("Invoices", michael);
        folderRepository.save(invoices);

        Folder wagesInfo = new Folder("wagesInfo", dwight);
        folderRepository.save(wagesInfo);

        File wages2019 = new File("wages2019", "xls", 90, wagesInfo);
        fileRepository.save(wages2019);

    }
}
