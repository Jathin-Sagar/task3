#!/bin/bash

# Define the container name and image name
containerName="springappcontainer3"
imageName="springappimagaug24"
imageTag="latest"

# Stop and remove the existing container if it exists
docker stop "$containerName" || true
docker rm "$containerName" || true

# Run the Docker container
docker run -d -p 8080:8080 --name "$containerName" "seerlajathin/$imageName:$imageTag"

