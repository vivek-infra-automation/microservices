#!/bin/bash

# Create AWS credentials secret
kubectl create secret generic aws-credentials \
  --from-literal=credentials="[default]
aws_access_key_id=YOUR_ACCESS_KEY
aws_secret_access_key=YOUR_SECRET_KEY" \
  --from-literal=config="[default]
region=us-east-1
output=json" \
  -n jenkins

echo "AWS credentials secret created"