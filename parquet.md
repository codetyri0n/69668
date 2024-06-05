### PARQUET
parquet is a structured data source to the query engine.

on disk data storage is done in four ways :
- matrix (logical model)
- row wise (physical model) 1-1 mapping rows and columns, horizontal partitioning
- columnar (physical model) vertical partitioning
- hybrid (physical model)

parquet uses the hybrid model which involves both vertical and horizontal 
partitioning.

## DATA ORGANIZATION WITH PARQUET
a parquet file typically consists of:
- row groups
- column chunks
- pages

the parquet file may consist of multiple row groups in which the column chunks 
are encapsulated.

each column chunk may contain multiple pages with 
- page metadata
- repetition/definition levels
- encoded values 

## POPULAR ENCODING SCHEMES 
plain encoding, rle_dictionary

# rle_dictionary
takes in uncompressed data that may have recurrences and performs compression
+ rle, bit-packing.

uncompressed data is converted to compressed form as a key value store where
there are mutliple keys for the indices of the data and correspondingly data is
scored in the keys of the appropriate index.

the compressed data in the dictionary is then converted to rle+bit-packed form
where the data values correspond to the keys with the corresponding index coupled
with the number of repetitions.



