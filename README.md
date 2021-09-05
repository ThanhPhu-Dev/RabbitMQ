<img src="https://user-images.githubusercontent.com/67057523/132116396-fe19695f-31f0-426c-811a-eac7991ba63b.PNG"></img>
## Chạy RabbitMQ bằng Docker.
 - Lệnh: docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3.7-management
 - Truy cập: http://localhost:15672 
 - User: guest 
 - Password: guest

## Chạy project
 - Lệnh command: mvn spring-boot:run
 - Sử dụng Postman để gửi request 
 <img src="https://user-images.githubusercontent.com/67057523/132116633-e56b38b9-32e2-436b-9472-00f5ed6bac7b.PNG"></img>
 - Kết quả nhận về từ Queue:
<img src="https://user-images.githubusercontent.com/67057523/132116696-1a87c098-8dc0-4eec-ada5-4ebb30b8f942.PNG"></img>

# Giao diện RabbitMQ sau khi run:

 - Queue (name = test_queue).
<img src="https://user-images.githubusercontent.com/67057523/132116744-0c4dbeed-92be-4cca-91d6-39ea00409337.PNG"></img>
 - Exchanges (name = test_exchange).
<img src="https://user-images.githubusercontent.com/67057523/132116804-609c9a67-d3d6-43af-867b-7b8e9eb67e90.PNG"></img>
 - Khi Message còn trong Queue.
<img src="https://user-images.githubusercontent.com/67057523/132116933-fcff2beb-499c-4612-a9da-ca526a5446b6.PNG"></img>