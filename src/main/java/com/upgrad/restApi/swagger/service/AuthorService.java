package com.upgrad.restApi.swagger.service;

import com.upgrad.restApi.swagger.dto.AuthorDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {

    public static ArrayList<AuthorDto> AUTHORS = new ArrayList<>();


    static {
        AuthorDto author1 = new AuthorDto();
        author1.setAuthId(1L);
        author1.setAuthName("Guddu");

        AuthorDto author2 = new AuthorDto();
        author2.setAuthName("Kalin");
        author2.setAuthId(2L);

        AuthorDto author3 = new AuthorDto();
        author3.setAuthName("RamPrasad");
        author3.setAuthId(3L);

        AUTHORS.add(author1);
        AUTHORS.add(author2);
        AUTHORS.add(author3);
    }

    public ArrayList<AuthorDto> getAuthors() {
        return AUTHORS;
    }

    public AuthorDto addAuthor(AuthorDto author) {
        AUTHORS.add(author);
        return author;
    }

    //IMPLEMENT PUT METHOD FOR UPDATE



   /* public  ArrayList<AuthorDto> updateAuthor(ArrayList<AuthorDto> author){
        for(AuthorDto i : author )
        {

            //i.setAuthId();
            //i.setAuthName();
        }
        return   author;
    }*/

    //DELETE AUTHOR BY AUTHOR ID
    public ArrayList<AuthorDto> deleteUser(int id){
        for(int i =0 ;i< AUTHORS.size(); i++){
            if(AUTHORS.get(i).getAuthId()==id){
                AUTHORS.remove(i);
            }
        }
        return AUTHORS;
    }

    //GET AUTHOR BY AUTHOR ID
    public  AuthorDto getUser(int id)
    {
        int index =0 ;
        for(int i =0 ;i< AUTHORS.size(); i++){
            if(AUTHORS.get(i).getAuthId()==id){
                index = i;
            }
        }
        return AUTHORS.get(index);
    }
}
