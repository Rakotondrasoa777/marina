package service;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class MarinaService {

    @SneakyThrows
    public String marina(String marinaFormul) {
        ProcessBuilder pb = new ProcessBuilder("docker", "run", "--rm",
                "marina" , marinaFormul);
        pb.redirectErrorStream(true);
        Process process = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String result = reader.readLine();
        process.waitFor();
        return result;

    }

}
