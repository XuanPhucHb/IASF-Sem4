Gọi API tìm kiếm:
		curl --location --request GET 'http://localhost:8081/nxp/v1/emp/findAllEmployees'
Gọi API thêm mới:
		curl --location --request POST 'http://localhost:8081/nxp/v1/emp/create' \
		--header 'Content-Type: application/json' \
		--data-raw '{
			"name":"nxp",
			"wage":26
		}'