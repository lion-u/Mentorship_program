https://www.howtoforge.com/tutorial/dockerizing-wordpress-with-nginx-and-php-fpm/
File and Directory List:
- docker-compose.yml: This is the docker-compose configuration file, you must create it when starting new docker-compose project.
- nginx/: This directory is used for our additional nginx configuration like the virtual host etc.
- db-data/: The volume/directory for the mysql data. The sql from data '/var/lib/mysql' is mounted to db-data directory.
- logs/: Directory for application log, nginx, mariadb and php-fpm.
- wordpress/: All wordpress files will be available in that directory.


