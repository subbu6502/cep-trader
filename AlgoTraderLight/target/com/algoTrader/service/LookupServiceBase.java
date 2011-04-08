// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package com.algoTrader.service;

/**
 * <p>
 * Spring Service base class for
 * <code>com.algoTrader.service.LookupService</code>, provides access to all
 * services and entities referenced by this service.
 * </p>
 * 
 * @see com.algoTrader.service.LookupService
 */
public abstract class LookupServiceBase
        implements com.algoTrader.service.LookupService {
	
	private com.algoTrader.entity.SecurityDao	securityDao;
	
	/**
	 * Sets the reference to <code>security</code>'s DAO.
	 */
	public void setSecurityDao(
	        final com.algoTrader.entity.SecurityDao securityDao) {
		this.securityDao = securityDao;
	}
	
	/**
	 * Gets the reference to <code>security</code>'s DAO.
	 */
	protected com.algoTrader.entity.SecurityDao getSecurityDao() {
		return securityDao;
	}
	
	private com.algoTrader.entity.StrategyDao	strategyDao;
	
	/**
	 * Sets the reference to <code>strategy</code>'s DAO.
	 */
	public void setStrategyDao(
	        final com.algoTrader.entity.StrategyDao strategyDao) {
		this.strategyDao = strategyDao;
	}
	
	/**
	 * Gets the reference to <code>strategy</code>'s DAO.
	 */
	protected com.algoTrader.entity.StrategyDao getStrategyDao() {
		return strategyDao;
	}
	
	private com.algoTrader.entity.PositionDao	positionDao;
	
	/**
	 * Sets the reference to <code>position</code>'s DAO.
	 */
	public void setPositionDao(
	        final com.algoTrader.entity.PositionDao positionDao) {
		this.positionDao = positionDao;
	}
	
	/**
	 * Gets the reference to <code>position</code>'s DAO.
	 */
	protected com.algoTrader.entity.PositionDao getPositionDao() {
		return positionDao;
	}
	
	private com.algoTrader.entity.TransactionDao	transactionDao;
	
	/**
	 * Sets the reference to <code>transaction</code>'s DAO.
	 */
	public void setTransactionDao(
	        final com.algoTrader.entity.TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}
	
	/**
	 * Gets the reference to <code>transaction</code>'s DAO.
	 */
	protected com.algoTrader.entity.TransactionDao getTransactionDao() {
		return transactionDao;
	}
	
	private com.algoTrader.entity.TickDao	tickDao;
	
	/**
	 * Sets the reference to <code>tick</code>'s DAO.
	 */
	public void setTickDao(final com.algoTrader.entity.TickDao tickDao) {
		this.tickDao = tickDao;
	}
	
	/**
	 * Gets the reference to <code>tick</code>'s DAO.
	 */
	protected com.algoTrader.entity.TickDao getTickDao() {
		return tickDao;
	}
	
	private com.algoTrader.entity.SecurityFamilyDao	securityFamilyDao;
	
	/**
	 * Sets the reference to <code>securityFamily</code>'s DAO.
	 */
	public void setSecurityFamilyDao(
	        final com.algoTrader.entity.SecurityFamilyDao securityFamilyDao) {
		this.securityFamilyDao = securityFamilyDao;
	}
	
	/**
	 * Gets the reference to <code>securityFamily</code>'s DAO.
	 */
	protected com.algoTrader.entity.SecurityFamilyDao getSecurityFamilyDao() {
		return securityFamilyDao;
	}
	
	/**
	 * @see com.algoTrader.service.LookupService#getSecurity(int)
	 */
	@Override
	public com.algoTrader.entity.Security getSecurity(final int id) {
		try {
			return handleGetSecurity(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getSecurity(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getSecurity(int)}
	 */
	protected abstract com.algoTrader.entity.Security handleGetSecurity(int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getSecurityByIsin(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Security getSecurityByIsin(
	        final java.lang.String isin) {
		if (isin == null || isin.trim().length() == 0) { throw new IllegalArgumentException(
		        "com.algoTrader.service.LookupService.getSecurityByIsin(java.lang.String isin) - 'isin' can not be null or empty"); }
		try {
			return handleGetSecurityByIsin(isin);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getSecurityByIsin(java.lang.String isin)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getSecurityByIsin(java.lang.String)}
	 */
	protected abstract com.algoTrader.entity.Security handleGetSecurityByIsin(
	        java.lang.String isin)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getSecurityFetched(int)
	 */
	@Override
	public com.algoTrader.entity.Security getSecurityFetched(final int id) {
		try {
			return handleGetSecurityFetched(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getSecurityFetched(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getSecurityFetched(int)}
	 */
	protected abstract com.algoTrader.entity.Security handleGetSecurityFetched(
	        int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllSecurities()
	 */
	@Override
	public com.algoTrader.entity.Security[] getAllSecurities() {
		try {
			return handleGetAllSecurities();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllSecurities()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllSecurities()}
	 */
	protected abstract com.algoTrader.entity.Security[]
	        handleGetAllSecurities()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllSecuritiesInPortfolio()
	 */
	@Override
	public com.algoTrader.entity.Security[] getAllSecuritiesInPortfolio() {
		try {
			return handleGetAllSecuritiesInPortfolio();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllSecuritiesInPortfolio()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllSecuritiesInPortfolio()}
	 */
	protected abstract com.algoTrader.entity.Security[]
	        handleGetAllSecuritiesInPortfolio()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getStrategy(int)
	 */
	@Override
	public com.algoTrader.entity.Strategy getStrategy(final int id) {
		try {
			return handleGetStrategy(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getStrategy(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getStrategy(int)}
	 */
	protected abstract com.algoTrader.entity.Strategy handleGetStrategy(int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getStrategyByName(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy getStrategyByName(
	        final java.lang.String name) {
		if (name == null || name.trim().length() == 0) { throw new IllegalArgumentException(
		        "com.algoTrader.service.LookupService.getStrategyByName(java.lang.String name) - 'name' can not be null or empty"); }
		try {
			return handleGetStrategyByName(name);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getStrategyByName(java.lang.String name)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getStrategyByName(java.lang.String)}
	 */
	protected abstract com.algoTrader.entity.Strategy handleGetStrategyByName(
	        java.lang.String name)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getStrategyByNameFetched(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy getStrategyByNameFetched(
	        final java.lang.String name) {
		if (name == null || name.trim().length() == 0) { throw new IllegalArgumentException(
		        "com.algoTrader.service.LookupService.getStrategyByNameFetched(java.lang.String name) - 'name' can not be null or empty"); }
		try {
			return handleGetStrategyByNameFetched(name);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getStrategyByNameFetched(java.lang.String name)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for
	 * {@link #getStrategyByNameFetched(java.lang.String)}
	 */
	protected abstract com.algoTrader.entity.Strategy
	        handleGetStrategyByNameFetched(java.lang.String name)
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAutoActivateStrategies()
	 */
	@Override
	public java.util.List getAutoActivateStrategies() {
		try {
			return handleGetAutoActivateStrategies();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAutoActivateStrategies()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAutoActivateStrategies()}
	 */
	protected abstract java.util.List handleGetAutoActivateStrategies()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllStrategies()
	 */
	@Override
	public com.algoTrader.entity.Strategy[] getAllStrategies() {
		try {
			return handleGetAllStrategies();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllStrategies()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllStrategies()}
	 */
	protected abstract com.algoTrader.entity.Strategy[]
	        handleGetAllStrategies()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getSecurityFamily(int)
	 */
	@Override
	public com.algoTrader.entity.SecurityFamily getSecurityFamily(final int id) {
		try {
			return handleGetSecurityFamily(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getSecurityFamily(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getSecurityFamily(int)}
	 */
	protected abstract com.algoTrader.entity.SecurityFamily
	        handleGetSecurityFamily(int id)
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getPosition(int)
	 */
	@Override
	public com.algoTrader.entity.Position getPosition(final int id) {
		try {
			return handleGetPosition(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getPosition(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPosition(int)}
	 */
	protected abstract com.algoTrader.entity.Position handleGetPosition(int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getPositionFetched(int)
	 */
	@Override
	public com.algoTrader.entity.Position getPositionFetched(final int id) {
		try {
			return handleGetPositionFetched(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getPositionFetched(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPositionFetched(int)}
	 */
	protected abstract com.algoTrader.entity.Position handleGetPositionFetched(
	        int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllPositions()
	 */
	@Override
	public com.algoTrader.entity.Position[] getAllPositions() {
		try {
			return handleGetAllPositions();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllPositions()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllPositions()}
	 */
	protected abstract com.algoTrader.entity.Position[] handleGetAllPositions()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getOpenPositions()
	 */
	@Override
	public com.algoTrader.entity.Position[] getOpenPositions() {
		try {
			return handleGetOpenPositions();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getOpenPositions()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getOpenPositions()}
	 */
	protected abstract com.algoTrader.entity.Position[]
	        handleGetOpenPositions()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getOpenPositionsByStrategy(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Position[] getOpenPositionsByStrategy(
	        final java.lang.String strategyName) {
		if (strategyName == null || strategyName.trim().length() == 0) { throw new IllegalArgumentException(
		        "com.algoTrader.service.LookupService.getOpenPositionsByStrategy(java.lang.String strategyName) - 'strategyName' can not be null or empty"); }
		try {
			return handleGetOpenPositionsByStrategy(strategyName);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getOpenPositionsByStrategy(java.lang.String strategyName)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for
	 * {@link #getOpenPositionsByStrategy(java.lang.String)}
	 */
	protected abstract com.algoTrader.entity.Position[]
	        handleGetOpenPositionsByStrategy(java.lang.String strategyName)
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getTransaction(int)
	 */
	@Override
	public com.algoTrader.entity.Transaction getTransaction(final int id) {
		try {
			return handleGetTransaction(id);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getTransaction(int id)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getTransaction(int)}
	 */
	protected abstract com.algoTrader.entity.Transaction handleGetTransaction(
	        int id)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllTransactions()
	 */
	@Override
	public com.algoTrader.entity.Transaction[] getAllTransactions() {
		try {
			return handleGetAllTransactions();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllTransactions()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllTransactions()}
	 */
	protected abstract com.algoTrader.entity.Transaction[]
	        handleGetAllTransactions()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllTrades()
	 */
	@Override
	public com.algoTrader.entity.Transaction[] getAllTrades() {
		try {
			return handleGetAllTrades();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllTrades()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllTrades()}
	 */
	protected abstract com.algoTrader.entity.Transaction[] handleGetAllTrades()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getAllCashFlows()
	 */
	@Override
	public com.algoTrader.entity.Transaction[] getAllCashFlows() {
		try {
			return handleGetAllCashFlows();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getAllCashFlows()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getAllCashFlows()}
	 */
	protected abstract com.algoTrader.entity.Transaction[]
	        handleGetAllCashFlows()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getLastTick(int)
	 */
	@Override
	public com.algoTrader.entity.Tick getLastTick(final int securityId) {
		try {
			return handleGetLastTick(securityId);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getLastTick(int securityId)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getLastTick(int)}
	 */
	protected abstract com.algoTrader.entity.Tick handleGetLastTick(
	        int securityId)
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getPortfolioValue()
	 */
	@Override
	public com.algoTrader.vo.PortfolioValueVO getPortfolioValue() {
		try {
			return handleGetPortfolioValue();
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getPortfolioValue()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPortfolioValue()}
	 */
	protected abstract com.algoTrader.vo.PortfolioValueVO
	        handleGetPortfolioValue()
	                throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.service.LookupService#getPositionBySecurityAndStrategy(int,
	 *      java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Position getPositionBySecurityAndStrategy(
	        final int securityId, final java.lang.String strategyName) {
		if (strategyName == null || strategyName.trim().length() == 0) { throw new IllegalArgumentException(
		        "com.algoTrader.service.LookupService.getPositionBySecurityAndStrategy(int securityId, java.lang.String strategyName) - 'strategyName' can not be null or empty"); }
		try {
			return handleGetPositionBySecurityAndStrategy(securityId,
			        strategyName);
		} catch (final Throwable th) {
			throw new com.algoTrader.service.LookupServiceException(
			        "Error performing 'com.algoTrader.service.LookupService.getPositionBySecurityAndStrategy(int securityId, java.lang.String strategyName)' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for
	 * {@link #getPositionBySecurityAndStrategy(int, java.lang.String)}
	 */
	protected abstract com.algoTrader.entity.Position
	        handleGetPositionBySecurityAndStrategy(int securityId,
	                java.lang.String strategyName)
	                throws java.lang.Exception;
	
	/**
	 * Gets the current <code>principal</code> if one has been set,
	 * otherwise returns <code>null</code>.
	 * 
	 * @return the current principal
	 */
	protected java.security.Principal getPrincipal() {
		return com.algoTrader.PrincipalStore.get();
	}
}