package com.SyauqiAuliyaJTidurJS.controller;

import com.SyauqiAuliyaJTidurJS.Algorithm;
import com.SyauqiAuliyaJTidurJS.dbjson.JsonTable;
import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface BasicGetController <T extends Serializable>{
    public abstract JsonTable<T> getJsonTable();
    @GetMapping("/{id}")
    public default T getById(@PathVariable int id){

        return Algorithm.<T>find(getJsonTable(), pred -> pred.id == id);
    };

    @GetMapping("/page")
    public default List<T> getPage(
            @RequestParam int page,
            @RequestParam int pageSize
    ){
        return Algorithm.<T>paginate(getJsonTable(), page, pageSize, pred -> true);
    };
}