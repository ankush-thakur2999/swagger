package com.upgrad.restApi.swagger.controller;


import com.upgrad.restApi.swagger.dto.AuthorDto;
import com.upgrad.restApi.swagger.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/authors")
@Api(value = "authors api", description = "Author Details")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @RequestMapping(value = "/getAuthors", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get Authors", notes = "Get all the Authors")
    public ArrayList<AuthorDto> getAllAuthors() {
        return service.getAuthors();
    }

    @RequestMapping(value = "/addAuthors", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "Add Author", notes = "Add a new author")
    public AuthorDto addAuthor(@RequestBody AuthorDto authorDto) {
         return service.addAuthor(authorDto);
    }

    //IMPLEMENT PUT METHOD FOR UPDATE
    /*@RequestMapping( value ="/updateAuthors", method =  RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value ="update author", notes ="updates a author")
    public  ArrayList<AuthorDto> updateAuthor (){
        return service.updateAuthor(service.getAuthors());
    }*/
    //DELETE AUTHOR BY AUTHOR ID
    @RequestMapping(value =  "/deleteAuthors", method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "Delete a author by Id",notes ="Deletes a author")
    public ArrayList<AuthorDto> deleteUserById(int id)
    {
        return service.deleteUser(id);
    }
    //GET AUTHOR BY AUTHOR IDA
    @RequestMapping(value =  "/getAAuthor", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get a author by Id",notes ="Get a author by id")
    public AuthorDto getUserById(int id)
    {
        return service.getUser(id);
    }

}
