package com.tencent.mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class GalleryItem
{
  public static class AlbumItem
    implements Parcelable
  {
    public static final Parcelable.Creator<AlbumItem> CREATOR;
    public int eGL;
    public String lBA;
    public GalleryItem.MediaItem lBB;
    
    static
    {
      GMTrace.i(15077214257152L, 112334);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15077214257152L, 112334);
    }
    
    protected AlbumItem(Parcel paramParcel)
    {
      GMTrace.i(15076811603968L, 112331);
      this.lBA = paramParcel.readString();
      this.eGL = paramParcel.readInt();
      this.lBB = ((GalleryItem.MediaItem)paramParcel.readParcelable(GalleryItem.MediaItem.class.getClassLoader()));
      GMTrace.o(15076811603968L, 112331);
    }
    
    public AlbumItem(String paramString, int paramInt)
    {
      GMTrace.i(11913299755008L, 88761);
      this.lBA = bg.nl(paramString);
      this.eGL = paramInt;
      GMTrace.o(11913299755008L, 88761);
    }
    
    public final String aDc()
    {
      GMTrace.i(11913433972736L, 88762);
      if (this.lBB == null)
      {
        GMTrace.o(11913433972736L, 88762);
        return null;
      }
      String str = this.lBB.aDc();
      GMTrace.o(11913433972736L, 88762);
      return str;
    }
    
    public final long aDd()
    {
      GMTrace.i(11913568190464L, 88763);
      if (this.lBB == null)
      {
        GMTrace.o(11913568190464L, 88763);
        return -1L;
      }
      long l = this.lBB.lBE;
      GMTrace.o(11913568190464L, 88763);
      return l;
    }
    
    public int describeContents()
    {
      GMTrace.i(15076945821696L, 112332);
      GMTrace.o(15076945821696L, 112332);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15077080039424L, 112333);
      paramParcel.writeString(this.lBA);
      paramParcel.writeInt(this.eGL);
      paramParcel.writeParcelable(this.lBB, paramInt);
      GMTrace.o(15077080039424L, 112333);
    }
  }
  
  public static class ImageMediaItem
    extends GalleryItem.MediaItem
  {
    public static final Parcelable.Creator<GalleryItem.MediaItem> CREATOR;
    
    static
    {
      GMTrace.i(11903367643136L, 88687);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(11903367643136L, 88687);
    }
    
    public ImageMediaItem()
    {
      GMTrace.i(11902428119040L, 88680);
      GMTrace.o(11902428119040L, 88680);
    }
    
    public ImageMediaItem(long paramLong)
    {
      super();
      GMTrace.i(11902562336768L, 88681);
      GMTrace.o(11902562336768L, 88681);
    }
    
    public ImageMediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
    {
      super(paramString1, paramString2, paramString3);
      GMTrace.i(11902696554496L, 88682);
      GMTrace.o(11902696554496L, 88682);
    }
    
    public final String aDc()
    {
      GMTrace.i(11902964989952L, 88684);
      if (!bg.nm(this.kXD))
      {
        str = this.kXD;
        GMTrace.o(11902964989952L, 88684);
        return str;
      }
      String str = this.gVn;
      GMTrace.o(11902964989952L, 88684);
      return str;
    }
    
    public int describeContents()
    {
      GMTrace.i(11903099207680L, 88685);
      GMTrace.o(11903099207680L, 88685);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(11902830772224L, 88683);
      GMTrace.o(11902830772224L, 88683);
      return 1;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(11903233425408L, 88686);
      paramParcel.writeString(this.gVn);
      paramParcel.writeString(this.kXD);
      paramParcel.writeLong(this.lBE);
      paramParcel.writeLong(this.lBF);
      paramParcel.writeString(this.mMimeType);
      GMTrace.o(11903233425408L, 88686);
    }
  }
  
  public static abstract class MediaItem
    implements Parcelable, Comparable<MediaItem>
  {
    public String gVn;
    public String kXD;
    public String lBC;
    public String lBD;
    public long lBE;
    public long lBF;
    public String mMimeType;
    
    public MediaItem()
    {
      this(0L, "", "", "");
      GMTrace.i(11913702408192L, 88764);
      GMTrace.o(11913702408192L, 88764);
    }
    
    public MediaItem(long paramLong)
    {
      this(paramLong, "", "", "");
      GMTrace.i(11913836625920L, 88765);
      GMTrace.o(11913836625920L, 88765);
    }
    
    public MediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(11913970843648L, 88766);
      this.lBE = paramLong;
      this.gVn = paramString1;
      this.kXD = paramString2;
      this.mMimeType = paramString3;
      GMTrace.o(11913970843648L, 88766);
    }
    
    public static MediaItem a(int paramInt, long paramLong, String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(11914105061376L, 88767);
      if (paramInt == 1)
      {
        paramString1 = new GalleryItem.ImageMediaItem(paramLong, paramString1, paramString2, paramString3);
        GMTrace.o(11914105061376L, 88767);
        return paramString1;
      }
      paramString1 = new GalleryItem.VideoMediaItem(paramLong, paramString1, paramString2, paramString3);
      GMTrace.o(11914105061376L, 88767);
      return paramString1;
    }
    
    public static MediaItem v(int paramInt, long paramLong)
    {
      GMTrace.i(11914239279104L, 88768);
      if (paramInt == 1)
      {
        localObject = new GalleryItem.ImageMediaItem(paramLong);
        GMTrace.o(11914239279104L, 88768);
        return (MediaItem)localObject;
      }
      Object localObject = new GalleryItem.VideoMediaItem(paramLong);
      GMTrace.o(11914239279104L, 88768);
      return (MediaItem)localObject;
    }
    
    public final int a(MediaItem paramMediaItem)
    {
      GMTrace.i(11914641932288L, 88771);
      if (this.lBF > paramMediaItem.lBF)
      {
        GMTrace.o(11914641932288L, 88771);
        return 1;
      }
      if (this.lBF < paramMediaItem.lBF)
      {
        GMTrace.o(11914641932288L, 88771);
        return -1;
      }
      GMTrace.o(11914641932288L, 88771);
      return -1;
    }
    
    public abstract String aDc();
    
    public boolean equals(Object paramObject)
    {
      GMTrace.i(11914776150016L, 88772);
      if ((paramObject != null) && ((paramObject instanceof MediaItem)))
      {
        paramObject = (MediaItem)paramObject;
        if ((this.gVn != null) && (this.gVn.equals(((MediaItem)paramObject).gVn)))
        {
          GMTrace.o(11914776150016L, 88772);
          return true;
        }
        GMTrace.o(11914776150016L, 88772);
        return false;
      }
      GMTrace.o(11914776150016L, 88772);
      return false;
    }
    
    public abstract int getType();
    
    public String toString()
    {
      GMTrace.i(11914910367744L, 88773);
      String str = "MediaItem{mOrignalPath='" + this.gVn + '\'' + ", mThumbPath='" + this.kXD + '\'' + ", origId=" + this.lBE + ", addDate=" + this.lBF + ", mMimeType='" + this.mMimeType + '\'' + '}';
      GMTrace.o(11914910367744L, 88773);
      return str;
    }
  }
  
  public static class VideoMediaItem
    extends GalleryItem.MediaItem
  {
    public static final Parcelable.Creator<GalleryItem.MediaItem> CREATOR;
    public String gVo;
    public String gVp;
    public int gVq;
    public int gVr;
    public int videoBitRate;
    public int videoFrameRate;
    public int videoHeight;
    public int videoWidth;
    
    static
    {
      GMTrace.i(11916252545024L, 88783);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(11916252545024L, 88783);
    }
    
    public VideoMediaItem()
    {
      GMTrace.i(11915178803200L, 88775);
      this.gVq = -1;
      this.videoHeight = -1;
      this.videoWidth = -1;
      this.videoBitRate = -1;
      this.gVr = -1;
      this.videoFrameRate = -1;
      GMTrace.o(11915178803200L, 88775);
    }
    
    public VideoMediaItem(long paramLong)
    {
      super();
      GMTrace.i(11915313020928L, 88776);
      this.gVq = -1;
      this.videoHeight = -1;
      this.videoWidth = -1;
      this.videoBitRate = -1;
      this.gVr = -1;
      this.videoFrameRate = -1;
      GMTrace.o(11915313020928L, 88776);
    }
    
    public VideoMediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
    {
      super(paramString1, paramString2, paramString3);
      GMTrace.i(11915447238656L, 88777);
      this.gVq = -1;
      this.videoHeight = -1;
      this.videoWidth = -1;
      this.videoBitRate = -1;
      this.gVr = -1;
      this.videoFrameRate = -1;
      GMTrace.o(11915447238656L, 88777);
    }
    
    public final String aDc()
    {
      GMTrace.i(11915715674112L, 88779);
      if (!bg.nm(this.kXD))
      {
        str = this.kXD;
        GMTrace.o(11915715674112L, 88779);
        return str;
      }
      String str = this.gVn;
      GMTrace.o(11915715674112L, 88779);
      return str;
    }
    
    public int describeContents()
    {
      GMTrace.i(11915849891840L, 88780);
      GMTrace.o(11915849891840L, 88780);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(11915581456384L, 88778);
      GMTrace.o(11915581456384L, 88778);
      return 2;
    }
    
    public String toString()
    {
      GMTrace.i(11916118327296L, 88782);
      String str = "VideoMediaItem{base=" + super.toString() + ", videoTrackMime='" + this.gVo + '\'' + ", audioTrackMime='" + this.gVp + '\'' + ", durationMs=" + this.gVq + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoBitRate=" + this.videoBitRate + ", videoIFrameInterval=" + this.gVr + ", videoFrameRate=" + this.videoFrameRate + '}';
      GMTrace.o(11916118327296L, 88782);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(11915984109568L, 88781);
      paramParcel.writeString(this.gVn);
      paramParcel.writeString(this.kXD);
      paramParcel.writeLong(this.lBE);
      paramParcel.writeString(this.mMimeType);
      paramParcel.writeInt(this.videoWidth);
      paramParcel.writeInt(this.videoHeight);
      paramParcel.writeInt(this.gVq);
      paramParcel.writeString(this.gVo);
      paramParcel.writeString(this.gVp);
      paramParcel.writeInt(this.gVr);
      paramParcel.writeInt(this.videoFrameRate);
      paramParcel.writeInt(this.videoBitRate);
      GMTrace.o(11915984109568L, 88781);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\GalleryItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */