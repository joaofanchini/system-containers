package br.com.docker.monitormanagercontainers.services;

import br.com.docker.monitormanagercontainers.data.models.Container;
import br.com.docker.monitormanagercontainers.data.models.Image;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagementService {

    // localhost:2375 -> Docker api

    private static List<Container> containerList = Arrays.asList(new Container("1","Nome"), new Container("2","Teste"));
    private static List<Image> imageList = Arrays.asList(new Image("1","teste"), new Image("2", "Teste 2"));

    public List<Container> getContainers(){
        return containerList;
    }

    public List<Image> getImages(){
        return imageList;
    }

    public void deleteImage(String id) {
        imageList = imageList.stream().filter(image->!image.getId().equalsIgnoreCase(id)).collect(Collectors.toList());
    }

    public void deleteContainer(String id) {

        containerList = containerList.stream().filter(container->!container.getId().equalsIgnoreCase(id)).collect(Collectors.toList());
        System.out.println(containerList);
        System.out.println(id);
    }
}
