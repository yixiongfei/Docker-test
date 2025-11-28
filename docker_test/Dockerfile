# 公式の OpenJDK 実行環境をベースイメージとして使用
FROM eclipse-temurin:21-jdk-alpine

LABEL authors="yi.xiongfei"

# 作業ディレクトリを設定
WORKDIR /app

# ビルド済みの jar ファイルをコンテナにコピー
COPY target/docker_test-0.0.1-SNAPSHOT.jar app.jar

# ポートを公開（Spring Boot のデフォルトは 8080）
EXPOSE 8080

# アプリケーションを起動
ENTRYPOINT ["java", "-jar", "app.jar"]
