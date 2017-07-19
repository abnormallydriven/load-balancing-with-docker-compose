Load Balancing With Docker-Compose

I created this project to explore the docker-compose tool. It
is a simple webservice that just returns a message that changes
based on which "instance" of the service responds to the request.
We use docker-compose to ensure that we can spin up two instances
of the service that are load balanced behind an nginx instance.
You can find an accompanying blog post here:
http://blog.abnormallydriven.com/2017/02/15/easy-service-load-balancing-with-docker-compose/

You can also find an example that makes use of docker-swarm to get
multiple instances of multiple services running on multiple hosts!
http://blog.abnormallydriven.com/2017/05/29/docker-swarm-with-compose-files/
https://github.com/abnormallydriven/docker-swarm-with-compose