CREATE DATABASE wxtms
     CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;
    
CREATE USER 'wxtms_dev'@'%' IDENTIFIED BY 'wxtms_dev';

GRANT ALL PRIVILEGES ON wxtms.* TO 'wxtms_dev'@'%'   WITH GRANT OPTION;