package com.tencent.mm.bu;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.a.a;
import com.tencent.mm.bu.a.d;
import com.tencent.mm.bu.a.f.a;
import java.util.HashMap;

public final class c
  implements Cursor, d
{
  private static Cursor vDb;
  
  public c()
  {
    GMTrace.i(13549279641600L, 100950);
    GMTrace.o(13549279641600L, 100950);
  }
  
  public static Cursor bVe()
  {
    GMTrace.i(13549413859328L, 100951);
    if (vDb == null) {
      vDb = new c();
    }
    Cursor localCursor = vDb;
    GMTrace.o(13549413859328L, 100951);
    return localCursor;
  }
  
  public final boolean AG(int paramInt)
  {
    GMTrace.i(13554782568448L, 100991);
    GMTrace.o(13554782568448L, 100991);
    return false;
  }
  
  public final a AH(int paramInt)
  {
    GMTrace.i(17536217251840L, 130655);
    GMTrace.o(17536217251840L, 130655);
    return null;
  }
  
  public final void AI(int paramInt)
  {
    GMTrace.i(13555990528000L, 101000);
    GMTrace.o(13555990528000L, 101000);
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(17536619905024L, 130658);
    GMTrace.o(17536619905024L, 130658);
  }
  
  public final boolean a(Object paramObject, a parama)
  {
    GMTrace.i(17536485687296L, 130657);
    GMTrace.o(17536485687296L, 130657);
    return false;
  }
  
  public final boolean bL(Object paramObject)
  {
    GMTrace.i(13554916786176L, 100992);
    GMTrace.o(13554916786176L, 100992);
    return false;
  }
  
  public final a bM(Object paramObject)
  {
    GMTrace.i(17536351469568L, 130656);
    GMTrace.o(17536351469568L, 130656);
    return null;
  }
  
  public final SparseArray[] bVf()
  {
    GMTrace.i(13555319439360L, 100995);
    GMTrace.o(13555319439360L, 100995);
    return null;
  }
  
  public final HashMap bVg()
  {
    GMTrace.i(18785650081792L, 139964);
    GMTrace.o(18785650081792L, 139964);
    return null;
  }
  
  public final boolean bVh()
  {
    GMTrace.i(13555453657088L, 100996);
    GMTrace.o(13555453657088L, 100996);
    return false;
  }
  
  public final void close()
  {
    GMTrace.i(13554514132992L, 100989);
    GMTrace.o(13554514132992L, 100989);
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    GMTrace.i(13554379915264L, 100988);
    GMTrace.o(13554379915264L, 100988);
  }
  
  public final void deactivate()
  {
    GMTrace.i(13554245697536L, 100987);
    GMTrace.o(13554245697536L, 100987);
  }
  
  public final byte[] getBlob(int paramInt)
  {
    GMTrace.i(13554111479808L, 100986);
    GMTrace.o(13554111479808L, 100986);
    return null;
  }
  
  public final int getColumnCount()
  {
    GMTrace.i(13553977262080L, 100985);
    GMTrace.o(13553977262080L, 100985);
    return 0;
  }
  
  public final int getColumnIndex(String paramString)
  {
    GMTrace.i(13553843044352L, 100984);
    GMTrace.o(13553843044352L, 100984);
    return 0;
  }
  
  public final int getColumnIndexOrThrow(String paramString)
  {
    GMTrace.i(13553708826624L, 100983);
    GMTrace.o(13553708826624L, 100983);
    return 0;
  }
  
  public final String getColumnName(int paramInt)
  {
    GMTrace.i(13553574608896L, 100982);
    GMTrace.o(13553574608896L, 100982);
    return null;
  }
  
  public final String[] getColumnNames()
  {
    GMTrace.i(13553440391168L, 100981);
    GMTrace.o(13553440391168L, 100981);
    return null;
  }
  
  public final int getCount()
  {
    GMTrace.i(13553306173440L, 100980);
    GMTrace.o(13553306173440L, 100980);
    return 0;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(13553171955712L, 100979);
    GMTrace.o(13553171955712L, 100979);
    return 0.0D;
  }
  
  public final Bundle getExtras()
  {
    GMTrace.i(13553037737984L, 100978);
    GMTrace.o(13553037737984L, 100978);
    return null;
  }
  
  public final float getFloat(int paramInt)
  {
    GMTrace.i(13552903520256L, 100977);
    GMTrace.o(13552903520256L, 100977);
    return 0.0F;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(13552769302528L, 100976);
    GMTrace.o(13552769302528L, 100976);
    return 0;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(13552635084800L, 100975);
    GMTrace.o(13552635084800L, 100975);
    return 0L;
  }
  
  public final Uri getNotificationUri()
  {
    GMTrace.i(13556124745728L, 101001);
    GMTrace.o(13556124745728L, 101001);
    return null;
  }
  
  public final int getPosition()
  {
    GMTrace.i(13552500867072L, 100974);
    GMTrace.o(13552500867072L, 100974);
    return 0;
  }
  
  public final short getShort(int paramInt)
  {
    GMTrace.i(13552366649344L, 100973);
    GMTrace.o(13552366649344L, 100973);
    return 0;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(13552232431616L, 100972);
    GMTrace.o(13552232431616L, 100972);
    return null;
  }
  
  public final int getType(int paramInt)
  {
    GMTrace.i(13554648350720L, 100990);
    GMTrace.o(13554648350720L, 100990);
    return 0;
  }
  
  public final boolean getWantsAllOnMoveCalls()
  {
    GMTrace.i(13552098213888L, 100971);
    GMTrace.o(13552098213888L, 100971);
    return false;
  }
  
  public final boolean isAfterLast()
  {
    GMTrace.i(13551963996160L, 100970);
    GMTrace.o(13551963996160L, 100970);
    return true;
  }
  
  public final boolean isBeforeFirst()
  {
    GMTrace.i(13551829778432L, 100969);
    GMTrace.o(13551829778432L, 100969);
    return false;
  }
  
  public final boolean isClosed()
  {
    GMTrace.i(13551695560704L, 100968);
    GMTrace.o(13551695560704L, 100968);
    return false;
  }
  
  public final boolean isFirst()
  {
    GMTrace.i(13551561342976L, 100967);
    GMTrace.o(13551561342976L, 100967);
    return false;
  }
  
  public final boolean isLast()
  {
    GMTrace.i(13551427125248L, 100966);
    GMTrace.o(13551427125248L, 100966);
    return false;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(13551292907520L, 100965);
    GMTrace.o(13551292907520L, 100965);
    return false;
  }
  
  public final void kN(boolean paramBoolean)
  {
    GMTrace.i(13555722092544L, 100998);
    GMTrace.o(13555722092544L, 100998);
  }
  
  public final boolean move(int paramInt)
  {
    GMTrace.i(13551158689792L, 100964);
    GMTrace.o(13551158689792L, 100964);
    return false;
  }
  
  public final boolean moveToFirst()
  {
    GMTrace.i(13551024472064L, 100963);
    GMTrace.o(13551024472064L, 100963);
    return false;
  }
  
  public final boolean moveToLast()
  {
    GMTrace.i(13550890254336L, 100962);
    GMTrace.o(13550890254336L, 100962);
    return false;
  }
  
  public final boolean moveToNext()
  {
    GMTrace.i(13550756036608L, 100961);
    GMTrace.o(13550756036608L, 100961);
    return false;
  }
  
  public final boolean moveToPosition(int paramInt)
  {
    GMTrace.i(13550621818880L, 100960);
    GMTrace.o(13550621818880L, 100960);
    return false;
  }
  
  public final boolean moveToPrevious()
  {
    GMTrace.i(13550487601152L, 100959);
    GMTrace.o(13550487601152L, 100959);
    return false;
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(13550353383424L, 100958);
    GMTrace.o(13550353383424L, 100958);
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(13550219165696L, 100957);
    GMTrace.o(13550219165696L, 100957);
  }
  
  public final boolean requery()
  {
    GMTrace.i(13550084947968L, 100956);
    GMTrace.o(13550084947968L, 100956);
    return false;
  }
  
  public final Bundle respond(Bundle paramBundle)
  {
    GMTrace.i(13549950730240L, 100955);
    GMTrace.o(13549950730240L, 100955);
    return null;
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    GMTrace.i(13556258963456L, 101002);
    GMTrace.o(13556258963456L, 101002);
  }
  
  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
    GMTrace.i(13549816512512L, 100954);
    GMTrace.o(13549816512512L, 100954);
  }
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(13549682294784L, 100953);
    GMTrace.o(13549682294784L, 100953);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(13549548077056L, 100952);
    GMTrace.o(13549548077056L, 100952);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */