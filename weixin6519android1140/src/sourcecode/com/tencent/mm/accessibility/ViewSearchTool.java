package com.tencent.mm.accessibility;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ViewSearchTool
{
  private static final String GET_DEFAULT_IMPL = "getDefault";
  private static final String GET_GLOBAL_INSTANCE = "getInstance";
  private static final String TAG = "ViewSearchTool";
  private static final String VIEWS_FIELD = "mViews";
  private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
  private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
  private static final String WINDOW_PARAMS_FIELD = "mParams";
  
  public ViewSearchTool()
  {
    GMTrace.i(15228477636608L, 113461);
    GMTrace.o(15228477636608L, 113461);
  }
  
  private List<View> filter(View paramView, Matcher paramMatcher)
  {
    GMTrace.i(15228880289792L, 113464);
    Object localObject = new ArrayList();
    ((List)localObject).add(0, Collections.singletonList(paramView));
    int i = 0;
    Iterator localIterator;
    View localView;
    for (;;)
    {
      paramView = new ArrayList();
      localIterator = ((List)((List)localObject).get(i)).iterator();
      while (localIterator.hasNext())
      {
        localView = (View)localIterator.next();
        if ((localView instanceof ViewGroup))
        {
          int j = 0;
          while (j < ((ViewGroup)localView).getChildCount())
          {
            paramView.add(((ViewGroup)localView).getChildAt(j));
            j += 1;
          }
        }
      }
      if (paramView.isEmpty()) {
        break;
      }
      ((List)localObject).add(paramView);
      i += 1;
    }
    paramView = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localIterator = ((List)((Iterator)localObject).next()).iterator();
      while (localIterator.hasNext())
      {
        localView = (View)localIterator.next();
        if (paramMatcher.match(localView)) {
          paramView.add(localView);
        }
      }
    }
    GMTrace.o(15228880289792L, 113464);
    return paramView;
  }
  
  private List<View> findRoots()
  {
    GMTrace.i(15228611854336L, 113462);
    Object localObject2;
    label30:
    Field localField;
    if (Build.VERSION.SDK_INT > 16)
    {
      localObject1 = "android.view.WindowManagerGlobal";
      if (Build.VERSION.SDK_INT <= 16) {
        break label123;
      }
      localObject2 = "getInstance";
      localObject1 = Class.forName((String)localObject1);
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, new Class[0]).invoke(null, new Object[0]);
      localField = ((Class)localObject1).getDeclaredField("mViews");
      localField.setAccessible(true);
      ((Class)localObject1).getDeclaredField("mParams").setAccessible(true);
      if (Build.VERSION.SDK_INT >= 19) {
        break label129;
      }
    }
    label123:
    label129:
    for (Object localObject1 = Arrays.asList((View[])localField.get(localObject2));; localObject1 = (List)localField.get(localObject2))
    {
      if (((List)localObject1).size() != 0) {
        break label141;
      }
      throw new RuntimeException("something wrong");
      localObject1 = "android.view.WindowManagerImpl";
      break;
      localObject2 = "getDefault";
      break label30;
    }
    label141:
    GMTrace.o(15228611854336L, 113462);
    return (List<View>)localObject1;
  }
  
  @Deprecated
  public static String findText(View paramView)
  {
    GMTrace.i(15229014507520L, 113465);
    if (paramView == null)
    {
      GMTrace.o(15229014507520L, 113465);
      return null;
    }
    Object localObject = paramView.getContentDescription();
    if (localObject == null)
    {
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int j = localViewGroup.getChildCount();
        int i = 0;
        for (paramView = (View)localObject;; paramView = (View)localObject)
        {
          localObject = paramView;
          if (i >= j) {
            break;
          }
          View localView = localViewGroup.getChildAt(i);
          localObject = paramView;
          if (localView != null) {
            if (!(localView instanceof ViewGroup))
            {
              localObject = paramView;
              if (!(localView instanceof TextView)) {}
            }
            else
            {
              paramView = findText(localView);
              localObject = paramView;
              if (paramView != null) {
                break;
              }
              localObject = paramView;
            }
          }
          i += 1;
        }
      }
      if ((paramView instanceof TextView)) {
        localObject = ((TextView)paramView).getText();
      }
      if (localObject != null)
      {
        paramView = ((CharSequence)localObject).toString();
        GMTrace.o(15229014507520L, 113465);
        return paramView;
      }
    }
    else
    {
      paramView = ((CharSequence)localObject).toString();
      GMTrace.o(15229014507520L, 113465);
      return paramView;
    }
    GMTrace.o(15229014507520L, 113465);
    return null;
  }
  
  @Deprecated
  public static String findViewDepth(View paramView1, View paramView2, String paramString)
  {
    GMTrace.i(15229148725248L, 113466);
    if ((paramView1 == null) || (paramView2 == null))
    {
      GMTrace.o(15229148725248L, 113466);
      return null;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (paramView1.equals(paramView2))
    {
      paramView1 = str;
      if (str.startsWith("_")) {
        paramView1 = str.substring(1);
      }
      GMTrace.o(15229148725248L, 113466);
      return paramView1;
    }
    if ((paramView1 instanceof ViewGroup))
    {
      paramView1 = (ViewGroup)paramView1;
      int j = paramView1.getChildCount();
      int i = 0;
      while (i < j)
      {
        paramString = findViewDepth(paramView1.getChildAt(i), paramView2, str + "_" + i);
        if ((paramString != null) && (!paramString.equals("")))
        {
          paramView1 = paramString;
          if (paramString.startsWith("_")) {
            paramView1 = paramString.substring(1);
          }
          GMTrace.o(15229148725248L, 113466);
          return paramView1;
        }
        i += 1;
      }
    }
    GMTrace.o(15229148725248L, 113466);
    return null;
  }
  
  public List<View> findView(Matcher paramMatcher)
  {
    GMTrace.i(15228746072064L, 113463);
    Iterator localIterator = findRoots().iterator();
    while (localIterator.hasNext())
    {
      List localList = filter((View)localIterator.next(), paramMatcher);
      if ((localList != null) && (localList.size() > 0))
      {
        GMTrace.o(15228746072064L, 113463);
        return localList;
      }
    }
    GMTrace.o(15228746072064L, 113463);
    return null;
  }
  
  public static abstract interface Matcher
  {
    public abstract boolean match(View paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\accessibility\ViewSearchTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */