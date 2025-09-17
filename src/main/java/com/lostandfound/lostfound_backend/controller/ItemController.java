package com.lostandfound.lostfound_backend.controller;

import com.lostandfound.entity.Item;
import com.lostandfound.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository repo;

    @GetMapping
    public List<Item> getAllItems() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return repo.save(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        Item existing = repo.findById(id).orElseThrow();
        existing.setTitle(item.getTitle());
        existing.setDescription(item.getDescription());
        existing.setStatus(item.getStatus());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        repo.deleteById(id);
        return "Item deleted.";
    }
}
