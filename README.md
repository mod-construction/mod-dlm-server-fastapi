

<div align="center">
    <a href="https://mod.construction/" target="_blank">
        <img src="https://raw.githubusercontent.com/mod-construction/mod-dlm-server-fastapi/main/mod-dlm-fastapi-server.png" alt="mod-dlm-logo"/>
    </a>



# mod-dlm-fastapi-server

[![build status](https://github.com/mod-construction/mod-dlm/actions/workflows/publish.yml/badge.svg)](https://github.com/mod-construction/mod-dlm/actions/workflows/publish.yml)
[![PyPI - Version](https://img.shields.io/pypi/v/mod-dlm-server)](https://pypi.org/project/mod-dlm-server/)
[![License](https://img.shields.io/github/license/mod-construction/mod-dlm)](https://opensource.org/licenses/MIT)
</div>

**mod-dlm-server** is an open-source REST server for storing and querying element data described using the **[mod-dlm](https://github.com/mod-construction/mod-dlm)** domain-specific language (DSL).
This project provides tools for defining entity models and automatically generating CRUD APIs, enabling suppliers to create and manage catalogs of their products easily.

You can always find the most up-to-date API documentation here: [mod-dlm API Docs](https://mod-construction.github.io/mod-dlm/)


The server is generated automatically using the  [OpenAPI Generator](https://openapi-generator.tech).

- API version: 1.0.7
- Build date: 2024-07-29T10:27:23.108497008Z[Etc/UTC]
- Generator version: 7.8.0-SNAPSHOT
- Build package: org.openapitools.codegen.languages.PythonFastAPIServerCodegen

## Requirements.

Python >= 3.7

## Installation & Usage

To run the server, please execute the following from the root directory:

```bash
pip install -r requirements.txt
PYTHONPATH=src uvicorn mod_dlm_server.main:app --host 0.0.0.0 --port 8080
```

and open your browser at `http://localhost:8080/docs/` to see the docs.

## Running with Docker

To run the server on a Docker container, please execute the following from the root directory:

```bash
docker-compose up --build
```

## Tests

To run the tests:

```bash
pip install pytest
PYTHONPATH=src pytest tests
```
