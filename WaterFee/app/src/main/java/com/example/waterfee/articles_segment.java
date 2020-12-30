package com.example.waterfee;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class articles_segment extends Fragment {
    ViewGroup viewGroup;
    RecyclerView mRecyclerView;
    articleAdapter mAdapter = null ;
    ArrayList<articleData> mList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.article_segment, container,false);

        mRecyclerView = viewGroup.findViewById(R.id.articlesRecyclerview) ;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new articleAdapter(mList) ;
        mRecyclerView.setAdapter(mAdapter) ;

        // < -- 파이어 베이스 정보 입력란 -- >
        addItem("수자원공사 댐13개, 홍수 제한수위 넘겼다 보도설명자료", "작성된 기사 내용1", "2020-08-24") ;
        addItem("한국수자원공사, 미래세대 청소년 대상 ‘기후위기 대응 프로젝트’ 본격 추진", "작성된 기사 내용2", "2020-08-24") ;
        addItem("한국수자원공사, 유럽국가 제치고 우즈베키스탄에 물기술 수출한다", "작성된 기사 내용3", "2020-08-18") ;
        addItem("한국수자원공사 임직원 봉사단, 폭우피해 현장 달려가", "작성된 기사 내용4", "2020-08-18") ;
        addItem("최근 충청·영남·호남 지역 홍수기 다목적댐운영에 관해 궁금한 사항을 설명 드립니다.", "작성된 기사 내용5", "2020-08-13") ;
        addItem("한국수자원공사, 수자원위성 활용해 물안심 선진국으로 도약", "작성된 기사 내용6", "2020-08-13") ;
        addItem("한국수자원공사, 물분야 개방형 혁신 연구과제 공모", "작성된 기사 내용7", "2020-08-13") ;
        addItem("한국수자원공사, 물산업 해외진출 지원에 본격 시동", "작성된 기사 내용8", "2020-08-13") ;
        addItem("한국수자원공사, 집중호우에 맞서 수문장 역할에 최선 다한다", "작성된 기사 내용9", "2020-08-13") ;
        addItem("한국수자원공사, 사회적경제기업 8곳 성장 지원에 나서", "작성된 기사 내용10", "2020-08-13") ;

        // !< -- 파이어 베이스 정보 입력란 -- >

        mAdapter.notifyDataSetChanged() ;

        return viewGroup;
    }

    public void addItem(String Title, String Content, String Date) {
        articleData item = new articleData();

        item.set_title(Title);
        item.set_content(Content);
        item.setDate(Date);

        mList.add(item);
    }

}
