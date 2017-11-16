package com.tencent.qqmusic.mediaplayer.upstream;

import android.text.TextUtils;

public class DefaultFileDataSourceFactory
  implements IDataSource.Factory
{
  private final String filePath;
  
  public DefaultFileDataSourceFactory(String paramString)
  {
    this.filePath = paramString;
  }
  
  public IDataSource createDataSource()
  {
    if (TextUtils.isEmpty(this.filePath)) {
      throw new DataSourceException(-5, "filePath is empty!");
    }
    return new FileDataSource(this.filePath);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\upstream\DefaultFileDataSourceFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */