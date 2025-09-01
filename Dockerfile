# Base image - Nginx
FROM nginx:alpine

# Copy HTML, CSS, JS files into nginx html folder
COPY src/ /usr/share/nginx/html/

# Expose port 80 for container
EXPOSE 80

