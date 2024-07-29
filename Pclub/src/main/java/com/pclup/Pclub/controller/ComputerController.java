package com.pclup.Pclub.controller;



import com.pclup.Pclub.model.Computer;
import com.pclup.Pclub.repository.ComputerRepository;
import com.pclup.Pclub.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@Controller
//public class ComputerController {
//
//    @Autowired
//    private ComputerService computerService;
//
//    @GetMapping("/computers")
//    public String getAllComputers(Model model) {
//        List<Computer> computers = computerService.getAllComputers();
//        model.addAttribute("computers", computers);
//       return "computers";
//
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateComputerStatus(@PathVariable Long id, boolean isAvailable) {
//        computerService.updateComputerStatus(id, isAvailable);
//        return "redirect:/";
//    }
//}

/////
//@Controller
//public class ComputerController {
//
//    private final ComputerService computerService;
//
//    @Autowired
//    public ComputerController(ComputerService computerService) {
//        this.computerService = computerService;
//    }
//
//    @GetMapping("/computers")
//    public String getAllComputers(Model model) {
//        List<Computer> computers = computerService.getAllComputers();
//        model.addAttribute("computers", computers);
//        return "computers";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateComputerStatus(@PathVariable Long id, boolean isAvailable) {
//        computerService.updateComputerStatus(id, isAvailable);
//        return "redirect:/";
//    }

@Controller
public class ComputerController {


//@Autowired
//private ComputerRepository computerRepository;
//
//
//
//    @GetMapping("/")
//    public String getIndexPage(Model model) {
//        // Получить список всех компьютеров из репозитория
//        Iterable<Computer> computers = computerRepository.findAll();
//        // Передать список компьютеров в модель
//        model.addAttribute("computers", computers);
//        // Вернуть имя шаблона для отображения
//        return "index";
//    }
//
//    @PostMapping("/update")
//
//    public void updateComputerStatus(Long computerId, String status) {
//        // Получить компьютер по ID из репозитория
//        Computer computer = computerRepository.findById(computerId)
//                .orElseThrow(() -> new RuntimeException("Computer not found"));
//        // Обновить статус компьютера
//        computer.setStatus(status);
//        // Сохранить изменения в базе данных
//        computerRepository.save(computer);
//    }
@Autowired
private ComputerService computerService;


    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("computers", computerService.getAllComputers());
        return "index";
    }
}

