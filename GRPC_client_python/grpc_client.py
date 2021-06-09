import grpc

import greeting_service_pb2
import greeting_service_pb2_grpc

def run():
    with grpc.insecure_channel('localhost:8080') as chanel:
        stub = greeting_service_pb2_grpc.GreetingSericeStub(chanel)
        response = stub.greeting(greeting_service_pb2.HelloRequest(name='Valeriy'))
    print(response.greeting)

run()
