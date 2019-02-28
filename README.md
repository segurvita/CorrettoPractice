# CorrettoPractice
これは個人の練習用リポジトリです。

Amazon CorrettoのDocker版の練習に使用します。



## 使い方

```bash
# amazon-corretto-8のイメージを入手
docker build -t amazon-corretto-8 github.com/corretto/corretto-8-docker

# Dockerfileをビルド
docker-compose build

# 起動
docker-compose up
```

上記のコマンドを実行し、以下のような情報が表示されれば、成功です。JDKは正常に動作しています。

```
Hello World!
openjdk version "1.8.0_202"
OpenJDK Runtime Environment Corretto-8.202.08.2 (build 1.8.0_202-b08)
OpenJDK 64-Bit Server VM Corretto-8.202.08.2 (build 25.202-b08, mixed mode)
```

