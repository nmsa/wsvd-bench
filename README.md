# wsvd-bench

This project contains the source code of the services that serve as `workload` of a benchmark for tools able to detect SQL injection vulnerabilities in web services.
The benchmark was introduced in [1], the papers explains the results and how they were obtained. The benchmark was later reused and extended in [2].

The ground truth of this workload is presented in the [detailed results](data/wsvd-bench-results-webservices-sqlinjection.xlsx) file.
In practice, it presents what is considered as the True Vulnerabilities (TV).

1. Nuno Antunes and Marco Vieira, *["Benchmarking Vulnerability Detection Tools for Web Services"](http://ieeexplore.ieee.org/document/5552783/)*, IEEE 8th International Conference on Web Services (ICWS 2010), Miami, Florida, USA: IEEE Computer Society, ISBN: 978-1-4244-8146-0, July 5-10, 2010, DOI:10.1109/ICWS.2010.76.  
2. Nuno Antunes and Marco Vieira, *["Assessing and Comparing Vulnerability Detection Tools for Web Services: Benchmarking Approach and Examples"](http://ieeexplore.ieee.org/document/6763052/)*, IEEE Transactions on Services Computing, vol. 8, no. 2, pp. 269–283, 2015, DOI: 10.1109/TSC.2014.2310221. 



###  Detailed usage steps:

1. A script to fill a `PostgreSQL` database can be found in database dump](data). It is a small version, just for demo.
2. Then, you need to configure the class `Database.java`
3. You can (must) replace the class `Logging.java` for your favorite logging framework.
4. Install the missing `maven` dependencies, located inside [install](install)
5. Build the `maven` package, 
6. After this, you just need to deploy the services in your app server.



###  Details of the sources


|    BM   |     Service Name    | # of Operations  | # of Vulnerabilities  | LoC/Op | Avg.C. Complexity |
|:-------:|:-------------------:|------:|--------:|-------:|-------:|
| TPC-App |    ProductDetail    |     2 |       0 |    242 |      5 |
|         |     NewProducts     |     2 |       1 |    206 |    4.5 |
|         |     NewCustomer     |     6 |      35 |   1230 |    5.6 |
|         | ChangePaymentMethod |     2 |       2 |    198 |      5 |
|                                                                   |
|  TPC-C  |       Delivery      |     9 |      10 |   2043 |     21 |
|         |       NewOrder      |     7 |      15 |   2317 |     33 |
|         |     OrderStatus     |     7 |      18 |   1463 |     13 |
|         |       Payment       |    13 |      34 |   4251 |     25 |
|         |      StockLevel     |     4 |       6 |    320 |      4 |
|                                                                   |
|  TPC-W  |     AdminUpdate     |     2 |       2 |    162 |      5 |
|         |  CreateNewCustomer  |     6 |      27 |    978 |      3 |
|         |  CreateShoppingCart |     2 |       0 |    414 |   2.67 |
|         |    DoAuthorSearch   |     2 |       1 |     88 |      3 |
|         |   DoSubjectSearch   |     2 |       1 |     90 |      3 |
|         |    DoTitleSearch    |     2 |       1 |     90 |      3 |
|         |    GetBestSellers   |     2 |       1 |    124 |      3 |
|         |     GetCustomer     |     2 |       1 |     92 |      4 |
|         |  GetMostRecentOrder |     2 |       1 |    258 |      6 |
|         |    GetNewProducts   |     2 |       1 |    100 |      3 |
|         |     GetPassword     |     2 |       1 |     80 |      2 |
|         |     GetUsername     |     2 |       0 |     80 |      2 |
|         |        Total        |    80 |     158 |  14826 |      - |





###  Other publications using the benchmark

TBC





