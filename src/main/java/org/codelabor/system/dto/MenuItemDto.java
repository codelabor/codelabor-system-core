/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codelabor.system.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 메뉴 아이템 DTO
 * 
 * @author Shin Sang-jae
 * 
 */
public class MenuItemDto implements Serializable {
	/**
	 * 시리얼 버전 UID
	 */
	private static final long serialVersionUID = 3253325473887636189L;
	/**
	 * 하위 메뉴 아이템 DTO List
	 */
	protected final List<MenuItemDto> childMenuItemDTOList = new ArrayList<MenuItemDto>();
	/**
	 * href 속성
	 */
	protected String href;

	/**
	 * id 속성
	 */
	protected String id;
	/**
	 * 활성화 여부
	 */
	protected boolean isEnable = true;
	/**
	 * 레이블 키
	 */
	protected String labelKey;
	/**
	 * target 속성
	 */
	protected String target = "_blank";

	/**
	 * 하위 메뉴 아이템을 추가한다.
	 * 
	 * @param menuItemDTO
	 *            하위 메뉴 아이템 DTO
	 */
	public void addChild(MenuItemDto menuItemDTO) {
		childMenuItemDTOList.add(menuItemDTO);
	}

	/**
	 * 하위 메뉴 아이템을 가져온다.
	 * 
	 * @param index
	 *            하위 메뉴 아이템의 인덱스
	 * @return 하위 메뉴 아이템 DTO
	 */
	public MenuItemDto getChild(int index) {
		return childMenuItemDTOList.get(index);
	}

	/**
	 * 하위 메뉴 아이템 DTO List 가져오기
	 * 
	 * @return 하위 메뉴 아이템 DTO List
	 */
	public List<MenuItemDto> getChildMenuItemDTOList() {
		return childMenuItemDTOList;
	}

	/**
	 * href 속성을 가져온다.
	 * 
	 * @return href href 속성
	 */
	public String getHref() {
		return href;
	}

	/**
	 * id 속성을 가져온다.
	 * 
	 * @return id 속성
	 */
	public String getId() {
		return id;
	}

	/**
	 * 레이블 키를 가져온다.
	 * 
	 * @return 레이블 키
	 */
	public String getLabelKey() {
		return labelKey;
	}

	/**
	 * terget 속성을 가져온다.
	 * 
	 * @return target 속성
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * 활성화 여부를 가져온다.
	 * 
	 * @return 활성화 여부
	 */
	public boolean isEnable() {
		return isEnable;
	}

	/**
	 * 하위 메뉴 아이템을 삭제한다.
	 * 
	 * @param index
	 *            하위 메뉴 아이템의 인덱스
	 * @return 제거된 하위 메뉴 아이템 DTO
	 */
	public MenuItemDto removeChild(int index) {
		return childMenuItemDTOList.remove(index);
	}

	/**
	 * 활성화 여부를 설정한다.
	 * 
	 * @param isEnable
	 *            활성화 여부
	 */
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	/**
	 * href 속성을 설정한다.
	 * 
	 * @param href
	 *            href 속성
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * id 속성을 설정한다.
	 * 
	 * @param id
	 *            id 속성
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 레이블 키를 설정한다.
	 * 
	 * @param labelKey
	 *            레이블 키
	 */
	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

	/**
	 * target 속성을 지정한다.
	 * 
	 * @param target
	 *            target 속성
	 */
	public void setTarget(String target) {
		this.target = target;
	}
}
