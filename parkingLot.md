### 1.?????

```
path:/ParkingLots  (POST)
request:{
    "name":"?????",
    "size":10
}
response:{
    "status":"add parkingLot successfully",
    "parkingLot":{
        "id": 1,
        "name":"?????",
        "size":10
    }
}

```
### 2.??????

```
path:/ParkingBoys  (POST)
request:{
    "name":"ocean",
    "parkingLotsList":[]
}
response:{
    status:"add parkingBoy successfully",
    "parkingBoy":{
        "id": 1,
        "name":"ocean",
        "parkingLotsList":[]
    }
}

```
### 3.??????????

```
path:/ParkingBoys{ParkingBoyId}/ParkingLots  (POST)
request:{
    "name":"?????",
    "size":10
}
response:{
    "status":"put parkingLots to parkingBoy successfully",
    "parkingBoy":{
        "id": 1,
        "name":"ocean",
        "parkingLotsList":[{
            "id": 1,
            "name":"?????",
            "size":10   
        }]
    }
}

```
