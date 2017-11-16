package com.tencent.tmassistantsdk.downloadservice;

import android.content.res.Resources.NotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteRange
{
  protected static final String BYTES_UNIT = "bytes";
  protected static final Pattern CONTENT_RANGE_HEADER_PATTERN = Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");
  protected static final String INVALID_RANGE_HEADER_REGEX = "((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)";
  protected static final Pattern RANGE_HEADER_PATTERN = Pattern.compile("^\\s*([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)\\s*$");
  protected static final String UNIT_REGEX = "([^=\\s]+)";
  protected static final String VALID_CONTENT_RANGE_HEADER_REGEX = "bytes\\s+(\\d+)-(\\d+)/(\\d+)";
  protected static final String VALID_RANGE_HEADER_REGEX = "([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)";
  protected final Long end;
  protected final long start;
  
  public ByteRange(long paramLong)
  {
    this(paramLong, null);
  }
  
  public ByteRange(long paramLong1, long paramLong2)
  {
    this(paramLong1, Long.valueOf(paramLong2));
    if (paramLong1 < 0L) {
      throw new IllegalArgumentException("If end is provided, start must be positive.");
    }
    if (paramLong2 < paramLong1) {
      throw new IllegalArgumentException("end must be >= start.");
    }
  }
  
  protected ByteRange(long paramLong, Long paramLong1)
  {
    this.start = paramLong;
    this.end = paramLong1;
  }
  
  public static long getTotalSize(String paramString)
  {
    int i = paramString.indexOf("/");
    if (i == -1) {
      throw new Resources.NotFoundException();
    }
    return Long.parseLong(paramString.substring(i + 1));
  }
  
  public static ByteRange parseContentRange(String paramString)
  {
    Matcher localMatcher = CONTENT_RANGE_HEADER_PATTERN.matcher(paramString);
    if (!localMatcher.matches()) {
      throw new Throwable("Invalid content-range format: " + paramString);
    }
    return new ByteRange(Long.parseLong(localMatcher.group(1)), Long.parseLong(localMatcher.group(2)));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ByteRange))
    {
      paramObject = (ByteRange)paramObject;
      if (this.start == ((ByteRange)paramObject).getStart()) {
        break label26;
      }
    }
    label26:
    while (hasEnd() != ((ByteRange)paramObject).hasEnd()) {
      return false;
    }
    if (hasEnd()) {
      return this.end.equals(Long.valueOf(((ByteRange)paramObject).getEnd()));
    }
    return true;
  }
  
  public long getEnd()
  {
    if (!hasEnd()) {
      throw new IllegalStateException("Byte-range does not have end.  Check hasEnd() before use");
    }
    return this.end.longValue();
  }
  
  public long getStart()
  {
    return this.start;
  }
  
  public boolean hasEnd()
  {
    return this.end != null;
  }
  
  public int hashCode()
  {
    int j = Long.valueOf(this.start).hashCode() + 629;
    int i = j;
    if (this.end != null) {
      i = j * 37 + this.end.hashCode();
    }
    return i;
  }
  
  public String toString()
  {
    if (this.end != null) {
      return "bytes=" + this.start + "-" + this.end;
    }
    if (this.start < 0L) {
      return "bytes=" + this.start;
    }
    return "bytes=" + this.start + "-";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\ByteRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */