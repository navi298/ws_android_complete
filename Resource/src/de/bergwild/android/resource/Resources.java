package de.bergwild.android.resource;

import java.util.Hashtable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import de.bw.mm.MStatics;

public class Resources {

	public static final String DEFAULT_DATAGROUP_ICON = "flag.png";

	public static Resources tool;
	private Hashtable<String, Bitmap> bitmaps = new Hashtable<String, Bitmap>();
	private Hashtable<String, Bitmap> scalledBitmaps = new Hashtable<String, Bitmap>();
	private Hashtable<String, Integer> resources = new Hashtable<String, Integer>();

	/**
	 * WICHTIG:
	 * 
	 * Hier in resources kommen nur Icons rein die in mehererne Apps verwendet werden, also z.b BWMobile und Tourbuilder
	 * oder die auch im Builder/Viewer verwendet werden.. Die App speziellen Icons bleiben in der App.
	 */

	public static Resources fac() {
		if (Resources.tool == null)
			tool = new Resources();

		return Resources.tool;
	}

	public Resources() {
		super();
		setResourcesHash();
	}

	public Bitmap getIcon(String name, Context context, float factor) {
		if (name == null)
			return null;

		if (scalledBitmaps.containsKey(name + factor))
			return scalledBitmaps.get(name + factor);
		return loadIcon(name, context, factor);
	}

	public Bitmap getIcon(String name, Context context, int w, int h) {
		if (name == null)
			return null;
		if (scalledBitmaps.containsKey(name + w + h))
			return scalledBitmaps.get(name + w + h);
		return loadIcon(name, context, w, h);
	}

	public Bitmap getIcon(String name, Context context) {
		if (name == null)
			return null;
		if (bitmaps.containsKey(name))
			return bitmaps.get(name);

		return loadIcon(name, context);

	}

	private void setResourcesHash() {
		resources.put("roadbook_bend_left.png", R.drawable.roadbook_bend_left);
		resources.put("roadbook_bend_left_r.png", R.drawable.roadbook_bend_left_r);
		resources.put("roadbook_bend_left_r_o.png", R.drawable.roadbook_bend_left_r_o);
		resources.put("roadbook_bend_right.png", R.drawable.roadbook_bend_right);
		resources.put("roadbook_bend_right_o.png", R.drawable.roadbook_bend_right_o);
		resources.put("roadbook_bend_right_o_l.png", R.drawable.roadbook_bend_right_o_l);
		resources.put("roadbook_lightbend_left.png", R.drawable.roadbook_lightbend_left);
		resources.put("roadbook_lightbend_left_o.png", R.drawable.roadbook_lightbend_left_o);
		resources.put("roadbook_lightbend_right.png", R.drawable.roadbook_lightbend_right);
		resources.put("roadbook_lightbend_right_o.png", R.drawable.roadbook_lightbend_right_o);
		resources.put("roadbook_sharpbend_right.png", R.drawable.roadbook_sharpbend_right);
		resources.put("roadbook_sharpbend_right_o.png", R.drawable.roadbook_sharpbend_right_o);
		resources.put("roadbook_sharpbend_left.png", R.drawable.roadbook_sharpbend_left);
		resources.put("roadbook_sharpbend_left_o.png", R.drawable.roadbook_sharpbend_left_o);
		resources.put("roadbook_straight.png", R.drawable.roadbook_straight);
		resources.put("roadbook_straight_l.png", R.drawable.roadbook_straight_l);
		resources.put("roadbook_straight_l_r.png", R.drawable.roadbook_straight_l_r);
		resources.put("et_map_info.png", R.drawable.et_map_info);
		resources.put("et_map_error.png", R.drawable.et_map_error);
		resources.put("et_report_content.png", R.drawable.et_report_content);
		resources.put("et_general_nice_view.png", R.drawable.et_general_nice_view);
		resources.put("et_general_special_area.png", R.drawable.et_general_special_area);
		resources.put("et_general_dangerwaypart.png", R.drawable.et_general_dangerwaypart);
		resources.put("et_general_startpoint.png", R.drawable.et_general_startpoint);
		resources.put("et_general_endpoint.png", R.drawable.et_general_endpoint);
		resources.put("et_general_note.png", R.drawable.et_general_note);
		resources.put("et_general_section_info.png", R.drawable.et_general_section_info);
		resources.put("et_general_activity.png", R.drawable.et_general_activity);
		resources.put("et_general_contact.png", R.drawable.et_general_contact);
		resources.put("et_general_object.png", R.drawable.et_general_object);
		resources.put("et_general_tip.png", R.drawable.et_general_tip);
		resources.put("et_general_sign.png", R.drawable.et_general_sign);
		resources.put("et_general_city.png", R.drawable.et_general_city);
		resources.put("et_general_animal.png", R.drawable.et_general_animal);
		resources.put("et_general_bird.png", R.drawable.et_general_bird);
		resources.put("et_general_idea.png", R.drawable.et_general_idea);
		resources.put("et_general_note.png", R.drawable.et_general_note);
		resources.put("et_places_rest_area.png", R.drawable.et_places_rest_area);
		resources.put("et_places_rest_area_with_shelter.png", R.drawable.et_places_rest_area_with_shelter);
		resources.put("et_places_rest_area_with_bbq.png", R.drawable.et_places_rest_area_with_bbq);
		resources.put("et_places_infocenter.png", R.drawable.et_places_infocenter);
		resources.put("et_overnight_hotel.png", R.drawable.et_overnight_hotel);
		resources.put("et_overnight_b_and_b.png", R.drawable.et_overnight_b_and_b);
		resources.put("et_overnight_hut.png", R.drawable.et_overnight_hut);
		resources.put("et_overnight_campingplace.png", R.drawable.et_overnight_campingplace);
		resources.put("et_overnight_campground.png", R.drawable.et_overnight_campground);
		resources.put("et_eatdrink_restaurant.png", R.drawable.et_eatdrink_restaurant);
		resources.put("et_eatdrink_pub.png", R.drawable.et_eatdrink_pub);
		resources.put("et_eatdrink_bar.png", R.drawable.et_eatdrink_bar);
		resources.put("et_eatdrink_beergarden.png", R.drawable.et_eatdrink_beergarden);
		resources.put("et_eatdrink_kiosk.png", R.drawable.et_eatdrink_kiosk);
		resources.put("et_building_shelter.png", R.drawable.et_building_shelter);
		resources.put("et_building_look_out_tower.png", R.drawable.et_building_look_out_tower);
		resources.put("et_building_museum.png", R.drawable.et_building_museum);
		resources.put("et_building_church.png", R.drawable.et_building_church);
		resources.put("et_traffic_busstation.png", R.drawable.et_traffic_busstation);
		resources.put("et_traffic_railstation.png", R.drawable.et_traffic_railstation);
		resources.put("et_traffic_subway.png", R.drawable.et_traffic_subway);
		resources.put("et_traffic_pickuppoint.png", R.drawable.et_traffic_pickuppoint);
		resources.put("et_traffic_taxistand.png", R.drawable.et_traffic_taxistand);
		resources.put("et_traffic_carpark.png", R.drawable.et_traffic_carpark);

		resources.put("topo_bed_32.png", R.drawable.topo_bed_32);
		resources.put("topo_beer_32.png", R.drawable.topo_beer_32);
		resources.put("topo_cafe_32.png", R.drawable.topo_cafe_32);
		resources.put("topo_caravan_32.png", R.drawable.topo_caravan_32);
		resources.put("topo_eye_32.png", R.drawable.topo_eye_32);
		resources.put("topo_food_32.png", R.drawable.topo_food_32);
		resources.put("topo_house1_32.png", R.drawable.topo_house1_32);
		resources.put("topo_house2_32.png", R.drawable.topo_house2_32);
		resources.put("topo_house3_32.png", R.drawable.topo_house3_32);
		resources.put("topo_hut_32.png", R.drawable.topo_hut_32);
		resources.put("topo_media_audio_32.png", R.drawable.topo_media_audio_32);
		resources.put("topo_media_photo_32.png", R.drawable.topo_media_photo_32);
		resources.put("topo_media_video_32.png", R.drawable.topo_media_video_32);
		resources.put("topo_tent_32.png", R.drawable.topo_tent_32);
		resources.put("topo_toilet_32.png", R.drawable.topo_toilet_32);
		resources.put("topo_tower_32.png", R.drawable.topo_tower_32);
		resources.put("topo_wine_32.png", R.drawable.topo_wine_32);
		resources.put("topo_flag_bed_48.png", R.drawable.topo_flag_bed_48);
		resources.put("topo_flag_beer_48.png", R.drawable.topo_flag_beer_48);
		resources.put("topo_flag_cafe_48.png", R.drawable.topo_flag_cafe_48);
		resources.put("topo_flag_caravan_48.png", R.drawable.topo_flag_caravan_48);
		resources.put("topo_flag_eye_48.png", R.drawable.topo_flag_eye_48);
		resources.put("topo_flag_food_48.png", R.drawable.topo_flag_food_48);
		resources.put("topo_flag_house1_48.png", R.drawable.topo_flag_house1_48);
		resources.put("topo_flag_house2_48.png", R.drawable.topo_flag_house2_48);
		resources.put("topo_flag_house3_48.png", R.drawable.topo_flag_house3_48);
		resources.put("topo_flag_hut_48.png", R.drawable.topo_flag_hut_48);
		resources.put("topo_flag_tent_48.png", R.drawable.topo_flag_tent_48);
		resources.put("topo_flag_tower_48.png", R.drawable.topo_flag_tower_48);
		resources.put("topo_flag_toilet_48.png", R.drawable.topo_flag_toilet_48);
		resources.put("topo_flag_wine_48.png", R.drawable.topo_flag_wine_48);
		resources.put("topo_flag_bed_red_48.png", R.drawable.topo_flag_bed_red_48);
		resources.put("topo_flag_beer_red_48.png", R.drawable.topo_flag_beer_red_48);
		resources.put("topo_flag_cafe_red_48.png", R.drawable.topo_flag_cafe_red_48);
		resources.put("topo_flag_caravan_red_48.png", R.drawable.topo_flag_caravan_red_48);
		resources.put("topo_flag_eye_red_48.png", R.drawable.topo_flag_eye_red_48);
		resources.put("topo_flag_food_red_48.png", R.drawable.topo_flag_food_red_48);
		resources.put("topo_flag_house1_red_48.png", R.drawable.topo_flag_house1_red_48);
		resources.put("topo_flag_house2_red_48.png", R.drawable.topo_flag_house2_red_48);
		resources.put("topo_flag_house3_red_48.png", R.drawable.topo_flag_house3_red_48);
		resources.put("topo_flag_hut_red_48.png", R.drawable.topo_flag_hut_red_48);
		resources.put("topo_flag_tent_red_48.png", R.drawable.topo_flag_tent_red_48);
		resources.put("topo_flag_tower_red_48.png", R.drawable.topo_flag_tower_red_48);
		resources.put("topo_flag_toilet_red_48.png", R.drawable.topo_flag_toilet_red_48);
		resources.put("topo_flag_wine_red_48.png", R.drawable.topo_flag_wine_red_48);
		resources.put("topo_target_32.png", R.drawable.topo_target_32);

//		Done.DIDITAGAIN;
		resources.put("topo_waypoint_image_32.png", R.drawable.topo_waypoint_image_32);
		resources.put("topo_waypoint_view_32.png", R.drawable.topo_waypoint_view_32);
		resources.put("topo_waypoint_way_32.png", R.drawable.topo_waypoint_way_32);

		resources.put("default_icon_dot_black_32.png", R.drawable.default_icon_dot_black_32);

		resources.put("tourtype_bike_32_32.png", R.drawable.tourtype_bike_32_32);
		resources.put("tourtype_bike_downhill_32_32.png", R.drawable.tourtype_bike_downhill_32_32);
		resources.put("tourtype_bike_offroad_32_32.png", R.drawable.tourtype_bike_offroad_32_32);
		resources.put("tourtype_canoe_32_32.png", R.drawable.tourtype_canoe_32_32);
		resources.put("tourtype_city_32_32.png", R.drawable.tourtype_city_32_32);
		resources.put("tourtype_city_history_32_32.png", R.drawable.tourtype_city_history_32_32);
		resources.put("tourtype_sightseeing_32_32.png", R.drawable.tourtype_sightseeing_32_32);
		resources.put("tourtype_trekking_32_32.png", R.drawable.tourtype_trekking_32_32);
		resources.put("tourtype_trekking_alpine_32_32.png", R.drawable.tourtype_trekking_alpine_32_32);
		resources.put("tourtype_trekking_beach_32_32.png", R.drawable.tourtype_trekking_beach_32_32);

		resources.put("transport_bike.png", R.drawable.transport_bike);
		resources.put("transport_byfeet.png", R.drawable.transport_byfeet);
		resources.put("transport_canoe.png", R.drawable.transport_canoe);
		resources.put("transport_car.png", R.drawable.transport_car);
		resources.put("transport_localtrafic.png", R.drawable.transport_localtrafic);
		resources.put("transport_mountainbike.png", R.drawable.transport_mountainbike);

		resources.put("content_audioshow_48.png", R.drawable.content_audioshow_48);
		resources.put("content_audio_48.png", R.drawable.content_audio_48);
		resources.put("content_video_48.png", R.drawable.content_video_48);

		resources.put("cont_black_audioshow_48.png", R.drawable.cont_black_audioshow_48);
		resources.put("cont_black_image_48.png", R.drawable.cont_black_image_48);
		resources.put("cont_black_text_48.png", R.drawable.cont_black_text_48);
		resources.put("cont_black_topomap_48.png", R.drawable.cont_black_topomap_48);
		resources.put("cont_black_video_48.png", R.drawable.cont_black_video_48);
		resources.put("cont_red_audioshow_48.png", R.drawable.cont_red_audioshow_48);
		resources.put("cont_red_image_48.png", R.drawable.cont_red_image_48);
		resources.put("cont_red_text_48.png", R.drawable.cont_red_text_48);
		resources.put("cont_red_topomap_48.png", R.drawable.cont_red_topomap_48);
		resources.put("cont_red_video_48.png", R.drawable.cont_red_video_48);

		resources.put("flag_blue_48.png", R.drawable.flag_blue_48);
		resources.put("flag_green_48.png", R.drawable.flag_green_48);
		resources.put("flag_pink_48.png", R.drawable.flag_pink_48);
		resources.put("flag_red_48.png", R.drawable.flag_red_48);
		resources.put("flag_yellow_48.png", R.drawable.flag_yellow_48);

		resources.put("poi_activity_48.png", R.drawable.poi_activity_48);
		resources.put("poi_animal_48.png", R.drawable.poi_animal_48);
		resources.put("poi_area_48.png", R.drawable.poi_area_48);
		resources.put("poi_bird_48.png", R.drawable.poi_bird_48);
		resources.put("poi_car_48.png", R.drawable.poi_car_48);
		resources.put("poi_cave_48.png", R.drawable.poi_cave_48);
		resources.put("poi_default_48.png", R.drawable.poi_default_48);
		resources.put("poi_geological_48.png", R.drawable.poi_geological_48);
		resources.put("poi_history_48.png", R.drawable.poi_history_48);
		resources.put("poi_history_building_48.png", R.drawable.poi_history_building_48);
		resources.put("poi_mountain_48.png", R.drawable.poi_mountain_48);
		resources.put("poi_myth_48.png", R.drawable.poi_myth_48);
		resources.put("poi_nationalpark_48.png", R.drawable.poi_nationalpark_48);
		resources.put("poi_nature_48.png", R.drawable.poi_nature_48);
		resources.put("poi_person_48.png", R.drawable.poi_person_48);
		resources.put("poi_show_48.png", R.drawable.poi_show_48);
		resources.put("poi_story_48.png", R.drawable.poi_story_48);
		resources.put("poi_thermo_48.png", R.drawable.poi_thermo_48);
		resources.put("poi_train_48.png", R.drawable.poi_train_48);
		resources.put("poi_village_48.png", R.drawable.poi_village_48);
		resources.put("poi_waterfall_48.png", R.drawable.poi_waterfall_48);
		resources.put("poi_water_48.png", R.drawable.poi_water_48);

		// /BWWorkflow/src/de/bergwild/workflow/resource/black_audio.png
		// /BWWorkflow/src/de/bergwild/workflow/resource/black_picture.png
		// /BWResources/src/de/bergwild/resource/map/black_video_48.png

	}

	private Bitmap loadIcon(String name, Context context) {
		Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), toResource(name));
		if (bitmap != null)
			bitmaps.put(name, bitmap);

		return bitmap;

	}

	public int toResource(String iconName) {
		if (resources.containsKey(iconName))
			return resources.get(iconName);
		return R.drawable.default_icon_dot_black_32;
	}

	private Bitmap loadIcon(String name, Context context, int w, int h) {
		Bitmap scalled = null;
		try {
			Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), toResource(name));

			if (bitmap != null) {
				scalled = Bitmap.createScaledBitmap(bitmap, w, h, true);
				if (scalled != null)
					scalledBitmaps.put(name + w + h, scalled);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return scalled;

	}

	private Bitmap loadIcon(String name, Context context, float factor) {

		Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), toResource(name));
		Bitmap scalled = null;
		if (bitmap != null) {
			scalled = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * factor), (int) (bitmap.getHeight() * factor), true);
			if (scalled != null)
				scalledBitmaps.put(name + factor, scalled);
		}
		return scalled;

	}

	/** transportation, also zu Fuß, per Rad, im Auto,... ist noch nicht berücksichtigt. Könnte aber, wenn Icons da sind **/
	public static Bitmap getIconForTourType(Context context, int tourType) {

		return BitmapFactory.decodeResource(context.getResources(), getIconIdForTourType(context, tourType));

	}

	/** transportation, also zu Fuß, per Rad, im Auto,... ist noch nicht berücksichtigt. Könnte aber, wenn Icons da sind **/
	public static Drawable getIconForTourTypeDrawable(Context context, int tourType) {

		return context.getResources().getDrawable(getIconIdForTourType(context, tourType));

	}

	/** transportation, also zu Fuß, per Rad, im Auto,... ist noch nicht berücksichtigt. Könnte aber, wenn Icons da sind **/
	public static Bitmap getIconForTourType(Context context, int tourType, int iconSize) {

		Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), getIconIdForTourType(context, tourType));
		if (decodeResource != null) {
			Bitmap scaledBitmap = Bitmap.createScaledBitmap(decodeResource, iconSize, iconSize, true);
			return scaledBitmap;
		}
		return decodeResource;

	}

	public static int getIconIdForTourType(Context context, int tourType) {

		switch (tourType) {
		case MStatics.TOURTYPE_SIGHTSEEING:
			return R.drawable.tourtype_sightseeing_32_32;
		case MStatics.TOURTYPE_TREKKING:
			return R.drawable.tourtype_trekking_32_32;
		case MStatics.TOURTYPE_TREKKING_ALPIN:
			return R.drawable.tourtype_trekking_alpine_32_32;
		case MStatics.TOURTYPE_TREKKING_BEACH:
			return R.drawable.tourtype_trekking_beach_32_32;
		case MStatics.TOURTYPE_BIKE:
			return R.drawable.tourtype_bike_32_32;
		case MStatics.TOURTYPE_BIKE_DOWNHILL:
			return R.drawable.tourtype_bike_downhill_32_32;
		case MStatics.TOURTYPE_BIKE_OFFROAD:
			return R.drawable.tourtype_bike_offroad_32_32;
		case MStatics.TOURTYPE_CITY:
			return R.drawable.tourtype_city_32_32;
		case MStatics.TOURTYPE_CITY_HISTORICAL:
			return R.drawable.tourtype_city_history_32_32;
		case MStatics.TOURTYPE_CANOE:
			return R.drawable.tourtype_canoe_32_32;
		default:
			return R.drawable.tourtype_sightseeing_32_32;
		}

	}

	public static int getIconIdForTransport(Context context, int transportation) {

		switch (transportation) {
		case MStatics.TRANSPORT_BIKE:
			return R.drawable.transport_bike;
		case MStatics.TRANSPORT_BYFEED:
			return R.drawable.transport_byfeet;
		case MStatics.TRANSPORT_CANOE:
			return R.drawable.transport_canoe;
		case MStatics.TRANSPORT_CAR:
			return R.drawable.transport_car;
		case MStatics.TRANSPORT_LOCALTRAFIC:
			return R.drawable.transport_localtrafic;
		case MStatics.TRANSPORT_MOUNTAINBIKE:
			return R.drawable.transport_mountainbike;
		default:
			return R.drawable.transport_byfeet;
		}

	}

	public static int getIconIdForElementType(int type) {

		switch (type) {
		case MStatics.ET_ROADBOOK_BEND_LEFT:
			return R.drawable.roadbook_bend_left_r;
		case MStatics.ET_ROADBOOK_BEND_LEFT_R:
			return R.drawable.roadbook_bend_left_r;
		case MStatics.ET_ROADBOOK_BEND_LEFT_R_O:
			return R.drawable.roadbook_bend_left_r_o;
		case MStatics.ET_ROADBOOK_BEND_RIGHT:
			return R.drawable.roadbook_bend_right;
		case MStatics.ET_ROADBOOK_BEND_RIGHT_O:
			return R.drawable.roadbook_bend_right_o;
		case MStatics.ET_ROADBOOK_BEND_RIGHT_O_L:
			return R.drawable.roadbook_bend_right_o_l;
		case MStatics.ET_ROADBOOK_LIGHTBEND_LEFT:
			return R.drawable.roadbook_lightbend_left;
		case MStatics.ET_ROADBOOK_LIGHTBEND_LEFT_0:
			return R.drawable.roadbook_lightbend_left_o;
		case MStatics.ET_ROADBOOK_LIGHTBEND_RIGHT:
			return R.drawable.roadbook_lightbend_right;
		case MStatics.ET_ROADBOOK_LIGHTBEND_RIGHT_0:
			return R.drawable.roadbook_lightbend_right_o;
		case MStatics.ET_ROADBOOK_SHARPBEND_RIGHT:
			return R.drawable.roadbook_sharpbend_right;
		case MStatics.ET_ROADBOOK_SHARPBEND_RIGHT_0:
			return R.drawable.roadbook_sharpbend_right_o;
		case MStatics.ET_ROADBOOK_SHARPBEND_LEFT:
			return R.drawable.roadbook_sharpbend_left;
		case MStatics.ET_ROADBOOK_SHARPBEND_LEFT_0:
			return R.drawable.roadbook_sharpbend_left_o;
		case MStatics.ET_ROADBOOK_STRAIGHT:
			return R.drawable.roadbook_straight;
		case MStatics.ET_ROADBOOK_STRAIGHT_L:
			return R.drawable.roadbook_straight_l;
		case MStatics.ET_ROADBOOK_STRAIGHT_L_R:
			return R.drawable.roadbook_straight_l_r;

		case MStatics.ET_MAP_ERROR:
			return R.drawable.et_map_error;
		case MStatics.ET_MAP_INFO:
			return R.drawable.et_map_info;
		case MStatics.ET_REPORT_CONTENT:
			return R.drawable.et_report_content;

		case MStatics.ET_GENERAL_NICE_VIEW:
			return R.drawable.et_general_nice_view;
		case MStatics.ET_GENERAL_SPECIAL_AREA:
			return R.drawable.et_general_special_area;
		case MStatics.ET_GENERAL_DANGERWAYPART:
			return R.drawable.et_general_dangerwaypart;
		case MStatics.ET_GENERAL_STARTPOINT:
			return R.drawable.et_general_startpoint;
		case MStatics.ET_GENERAL_ENDPOINT:
			return R.drawable.et_general_endpoint;
		case MStatics.ET_GENERAL_NOTE:
			return R.drawable.et_general_note;
		case MStatics.ET_GENERAL_SECTION_INFO:
			return R.drawable.et_general_section_info;
		case MStatics.ET_GENERAL_ACTIVITY:
			return R.drawable.et_general_activity;
		case MStatics.ET_GENERAL_CONTACT:
			return R.drawable.et_general_contact;
		case MStatics.ET_GENERAL_OBJECT:
			return R.drawable.et_general_object;

		case MStatics.ET_GENERAL_TIP:
			return R.drawable.et_general_tip;
		case MStatics.ET_GENERAL_SIGN:
			return R.drawable.et_general_sign;
		case MStatics.ET_GENERAL_CITY:
			return R.drawable.et_general_city;

		case MStatics.ET_GENERAL_ANIMAL:
			return R.drawable.et_general_animal;
		case MStatics.ET_GENERAL_BIRD:
			return R.drawable.et_general_bird;
		case MStatics.ET_GENERAL_IDEA:
			return R.drawable.et_general_idea;

		case MStatics.ET_PLACES_REST_AREA:
			return R.drawable.et_places_rest_area;
		case MStatics.ET_PLACES_REST_AREA_WITH_SHELTER:
			return R.drawable.et_places_rest_area_with_shelter;
		case MStatics.ET_PLACES_REST_AREA_WITH_BBQ:
			return R.drawable.et_places_rest_area_with_bbq;
		case MStatics.ET_PLACES_INFOCENTER:
			return R.drawable.et_places_infocenter;
		case MStatics.ET_OVERNIGHT_HOTEL:
			return R.drawable.et_overnight_hotel;
		case MStatics.ET_OVERNIGHT_B_AND_B:
			return R.drawable.et_overnight_b_and_b;
		case MStatics.ET_OVERNIGHT_HUT:
			return R.drawable.et_overnight_hut;
		case MStatics.ET_OVERNIGHT_CAMPINGPLACE:
			return R.drawable.et_overnight_campingplace;
		case MStatics.ET_OVERNIGHT_CAMPGROUND:
			return R.drawable.et_overnight_campground;

		case MStatics.ET_EATDRINK_RESTAURANT:
			return R.drawable.et_eatdrink_restaurant;
		case MStatics.ET_EATDRINK_PUB:
			return R.drawable.et_eatdrink_pub;
		case MStatics.ET_EATDRINK_BAR:
			return R.drawable.et_eatdrink_bar;
		case MStatics.ET_EATDRINK_BEERGARDEN:
			return R.drawable.et_eatdrink_beergarden;
		case MStatics.ET_EATDRINK_KIOSK:
			return R.drawable.et_eatdrink_kiosk;

		case MStatics.ET_BUILDING_SHELTER:
			return R.drawable.et_building_shelter;
		case MStatics.ET_BUILDING_LOOK_OUT_TOWER:
			return R.drawable.et_building_look_out_tower;
		case MStatics.ET_BUILDING_MUSEUM:
			return R.drawable.et_building_museum;
		case MStatics.ET_BUILDING_CHURCH:
			return R.drawable.et_building_church;
		case MStatics.ET_TRAFFIC_BUSSTATION:
			return R.drawable.et_traffic_busstation;
		case MStatics.ET_TRAFFIC_RAILSTATION:
			return R.drawable.et_traffic_railstation;
		case MStatics.ET_TRAFFIC_SUBWAY:
			return R.drawable.et_traffic_subway;
		case MStatics.ET_TRAFFIC_PICKUPPOINT:
			return R.drawable.et_traffic_pickuppoint;
		case MStatics.ET_TRAFFIC_TAXISTAND:
			return R.drawable.et_traffic_taxistand;
		case MStatics.ET_TRAFFIC_PARKINGGROUND:
			return R.drawable.et_traffic_carpark;

		default:
			return R.drawable.default_icon_dot_black_32;

		}
	}

}
