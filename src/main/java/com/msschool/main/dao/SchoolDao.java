package com.msschool.main.dao;

import com.msschool.main.dao.daointerface.SimpleDao;
import com.msschool.main.dao.repository.SchoolRepo;
import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import com.msschool.main.model.entity.SchoolModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SchoolDao implements SimpleDao<SchoolDomain, String> {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    SchoolRepo schoolRepo;

    @Override
    public String create(SchoolDomain data)  {
        SchoolModel saveData = this.convertToModel(data);
        saveData = this.schoolRepo.save(saveData);
        return saveData.getId();
    }

    @Override
    public SchoolDomain read(String id) {
        SchoolDomain data = null;
        Optional<SchoolModel> savedData = this.schoolRepo.findById(id);
        if(savedData.isPresent()){
            data = this.convertToDomain(savedData.get());
        }
        return data;
    }

    @Override
    public List<SchoolDomain> read() {
        List<SchoolDomain> result = new ArrayList<>();
        List<SchoolModel> savedData = this.schoolRepo.findAll();

        savedData.forEach(schoolModel -> result.add(this.convertToDomain(schoolModel)));

        return result;
    }

    @Override
    public String update(SchoolDomain data) {
        String id="";
        Optional<SchoolModel> savedData = this.schoolRepo.findById(data.getId());
        if(savedData.isPresent()){
            SchoolModel saveData = this.convertToModel(data);
            saveData = this.schoolRepo.save(saveData);
            id = saveData.getId();
        }
        return id;
    }

    @Override
    public void delete(String id) {
        Optional<SchoolModel> savedData = this.schoolRepo.findById(id);
        if(savedData.isPresent()){
            this.schoolRepo.delete(savedData.get());
        }
    }

    private SchoolModel convertToModel(SchoolDomain SchoolDomain) {
        SchoolModel schoolModel = modelMapper.map(SchoolDomain, SchoolModel.class);
        return schoolModel;
    }

    private SchoolDomain convertToDomain(SchoolModel model) {
        SchoolDomain SchoolDomain = modelMapper.map(model, SchoolDomain.class);
        return SchoolDomain;
    }

    public SchoolDomain convertDtoToDomain(SchoolDto schoolDto) {
        SchoolDomain schoolDomain = modelMapper.map(schoolDto, SchoolDomain.class);
        return schoolDomain;
    }

    public SchoolDto convertDomainToDto(SchoolDomain schoolDomain) {
        SchoolDto schoolDto = modelMapper.map(schoolDomain, SchoolDto.class);
        return schoolDto;
    }


//    private Post convertToEntity(PostDto postDto) throws ParseException {
//        Post post = modelMapper.map(postDto, Post.class);
//        post.setSubmissionDate(postDto.getSubmissionDateConverted(
//                userService.getCurrentUser().getPreference().getTimezone()));
//
//        if (postDto.getId() != null) {
//            Post oldPost = postService.getPostById(postDto.getId());
//            post.setRedditID(oldPost.getRedditID());
//            post.setSent(oldPost.isSent());
//        }
//        return post;
//    }
//
//    private PostDto convertToDto(Post post) {
//        PostDto postDto = modelMapper.map(post, PostDto.class);
//        postDto.setSubmissionDate(post.getSubmissionDate(),
//                userService.getCurrentUser().getPreference().getTimezone());
//        return postDto;
//    }
}
