package com.lostandfound.lostfound_backend.controller;

import com.lostandfound.entity.Request;
import com.lostandfound.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
@RequiredArgsConstructor
public class RequestController {

    private final RequestRepository repo;

    @GetMapping
    public List<Request> getAllRequests() {
        return repo.findAll();
    }

    @PostMapping
    public Request createRequest(@RequestBody Request request) {
        return repo.save(request);
    }

    @PutMapping("/{id}")
    public Request updateRequest(@PathVariable Long id, @RequestBody Request request) {
        Request existing = repo.findById(id).orElseThrow();
        existing.setMessage(request.getMessage());
        existing.setStatus(request.getStatus());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public String deleteRequest(@PathVariable Long id) {
        repo.deleteById(id);
        return "Request deleted.";
    }
}
