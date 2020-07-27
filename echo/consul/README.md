
## Start up consul agent with config folder
`consul agent -dev -node <hostname> -config-dir=./consul.d`

## DNS queries 
`dig @127.0.0.1 -p 8600 <service_name>.service.consul SRV`

