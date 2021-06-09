# gRPC Server, Java and Python clients
gRPC learning

### for Python
	# скачать библиотеку
    python -m pip install grpcio		
	# скачать библиотеку
    python -m pip install grpcio-tools
    # сгенерировать файлы классов GRPC
	python -m grpc_tools.protoc -I./ --python_out=. --grpc_python_out=. greeting_service.proto

### Useful links
<a href="https://www.youtube.com/watch?v=SMy4CaxizbA">gRPC — альтернатива REST API от Google. Пишем gRPC сервер и клиент на Java и Python</a>
