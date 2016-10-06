package com.rachit.bookstore.service.order.proxy.inventory;

import java.util.UUID;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("inventory-service")
@RibbonClient
public interface InventoryServiceProxy {

	@RequestMapping(value = "/inventory/sellerId/{sellerId}/isbn/{isbn}", method = RequestMethod.GET)
	public Inventory getInventory(@PathVariable("sellerId")Long sellerId, @PathVariable("isbn") UUID isbn);

}
