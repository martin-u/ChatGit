dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
	username = "postgres"
	password = "jsp93?Tc"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
}

environments {
    development {
        dataSource {
            dbCreate = "update" 
            url ="jdbc:postgresql://localhost/chat"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
			url ="jdbc:postgresql://localhost/chat"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
			url ="jdbc:postgresql://localhost/chat"
        }
    }
}

