echo "Compiling proto files..." && buf generate

echo "Generating OpenAPI docs..."
protoc -I . --openapiv2_out ./openapiv2 --openapiv2_opt logtostderr=true --openapiv2_opt allow_merge=true \
       types/*.proto \
       iam/v1/*.proto \
       base/v1/*.proto \
       operations/v1/*.proto

echo "Generating html docs..."
protoc --doc_out=./generated/ --doc_opt=html,index.html \
       types/*.proto \
       iam/v1/*.proto \
       base/v1/*.proto \
       operations/v1/*.proto
