#Verify the application is running at:
    API: http://localhost:8080/number
	Prometheus metrics: http://localhost:8080/actuator/prometheus

#Start Prometheus and Grafana using Docker Compose
    docker-compose up -d

#Access Services:
    Prometheus: http://localhost:9090 - used for querying metrics.
    Grafana: http://localhost:3000 - default login is admin/admin.

#Configure Grafana

	1.	Add Prometheus Data Source in Grafana:
	•	Go to Configuration > Data Sources > Add data source in Grafana.
	•	Select Prometheus and set the URL to http://prometheus:9090.
	•	Save and test the connection.
	2.	Create a Grafana Dashboard:
	•	Create a new dashboard, and add a panel using the query hello_requests_total to track the custom metric.

#Testing the Setup

	1.	Generate Metrics:
	•	Visit http://localhost:8080/hello several times to increase the hello_requests_total metric count.
	2.	Check Metrics in Prometheus:
	•	Open Prometheus and query hello_requests_total to verify Prometheus is collecting the metric.
	3.	View Metrics in Grafana:
	•	Open the dashboard in Grafana to view real-time metrics from the Spring Boot application.