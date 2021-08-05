package com.example.multitypeview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multitypeview.R;
import com.example.multitypeview.models.Ads;
import com.example.multitypeview.models.Item;
import com.example.multitypeview.models.News;
import com.example.multitypeview.models.Trip;

import java.util.List;


public class TripsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> items;

    public TripsAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //tipe : 0 = trip, 1=ads, 2=news
        if (viewType==0){
            return new TripViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_trip, parent, false));
        }else if(viewType==1){
            return new AdsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_ads, parent, false));
        }else {
            return new NewsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_news, parent,false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (getItemViewType(position)==0){
            Trip trip  = (Trip) items.get(position).getObject();
            ((TripViewHolder) holder).setTripData(trip);
        }else if (getItemViewType(position)==1){
            Ads ads = (Ads) items.get(position).getObject();
            ((AdsViewHolder) holder).setAdsData(ads);
        }else{
            News news = (News) items.get(position).getObject();
            ((NewsViewHolder)holder).setNewsData(news);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    static class TripViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageTrip;
        private TextView textTripTittle, textTrip;

        TripViewHolder(View itemView) {
            super(itemView);
            imageTrip = itemView.findViewById(R.id.img_card1);
            textTripTittle = itemView.findViewById(R.id.tv_card1);
            textTrip = itemView.findViewById(R.id.tv_card12);
        }
        void setTripData(Trip trip){
            imageTrip.setImageResource(trip.getTripimage());
            textTripTittle.setText(trip.getTriptittle());
            textTrip.setText(trip.getTrip());
        }
    }

    static class AdsViewHolder extends RecyclerView.ViewHolder{

        private TextView textAdsTittle, textAds;

        AdsViewHolder(View itemView) {
            super(itemView);
            textAdsTittle = itemView.findViewById(R.id.tv_cardI1);
            textAds = itemView.findViewById(R.id.tv_cardI2);
        }
        void setAdsData(Ads ads){
            textAdsTittle.setText(ads.getAdsTittle());
            textAds.setText(ads.getAds());
        }
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder{

        private TextView textNewsTittle, textNews;

        NewsViewHolder(View itemView) {
            super(itemView);
            textNewsTittle = itemView.findViewById(R.id.id_cardN1);
            textNews = itemView.findViewById(R.id.id_cardN2);
        }
        void setNewsData(News news){
            textNewsTittle.setText(news.getNewsTittle());
            textNews.setText(news.getNews());
        }
    }
}
