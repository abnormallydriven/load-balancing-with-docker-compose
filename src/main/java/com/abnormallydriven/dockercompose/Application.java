package com.abnormallydriven.dockercompose;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        String serviceName = System.getenv("service_name");
        get("/hello", (request, response) -> "Hello from " + serviceName + ".");
    }
}