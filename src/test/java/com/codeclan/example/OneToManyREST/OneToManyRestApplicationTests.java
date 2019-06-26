package com.codeclan.example.OneToManyREST;

import com.codeclan.example.OneToManyREST.models.Folder;
import com.codeclan.example.OneToManyREST.models.User;
import com.codeclan.example.OneToManyREST.repositories.FileRepository;
import com.codeclan.example.OneToManyREST.repositories.FolderRepository;
import com.codeclan.example.OneToManyREST.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyRestApplicationTests {

	@Autowired
	FileRepository fileRepository;

    @Autowired
	UserRepository userRepository;

    @Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUserAndFolderThenSave(){
		User michael = new User("Michael Scott");
//        userRepository.save(michael);
		Folder invoices = new Folder("Invoices", michael);
//        folderRepository.save(invoices);

	}

}
