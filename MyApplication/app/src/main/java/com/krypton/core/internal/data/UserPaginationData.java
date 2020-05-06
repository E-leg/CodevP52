package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class UserPaginationData implements QueryData {
	public Map<String, Pagination> data;
	public List<Map<String, String>> errors;

	@Override
	public Map<String, Pagination> getData() {
		return this.data;
	}

	@Override
	public List<Map<String, String>> getErrors() {
		return this.errors;
	}
	
	public class Pagination {
		private List<Map<String, Object>> items;
		private PageInfo pageInfo;

		public List<Map<String, Object>> getItems() {
			return items;
		}

		public PageInfo getPageInfos() {
			return pageInfo;
		}
		
	
	}
	
	public class PageInfo {
		private int currentPage;
		private int perPage;
		private int pageCount;
		private int itemCount;
		private boolean hasNextPage;
		private boolean hasPreviousPage;
		
		public int getCurrentPage() {
			return currentPage;
		}
		public int getPerPage() {
			return perPage;
		}
		public int getPageCount() {
			return pageCount;
		}
		public int getItemCount() {
			return itemCount;
		}
		public boolean hasNextPage() {
			return hasNextPage;
		}
		public boolean hasPreviousPage() {
			return hasPreviousPage;
		}
	}
}


