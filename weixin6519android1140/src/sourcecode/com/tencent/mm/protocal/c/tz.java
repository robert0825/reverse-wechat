package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tz
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String info;
  public String thumbUrl;
  public String title;
  public boolean ujm;
  public boolean ujn;
  public boolean ulw;
  public boolean ulx;
  
  public tz()
  {
    GMTrace.i(3704543510528L, 27601);
    this.ujm = false;
    this.ujn = false;
    this.ulw = false;
    this.ulx = false;
    GMTrace.o(3704543510528L, 27601);
  }
  
  public final tz Rh(String paramString)
  {
    GMTrace.i(3704677728256L, 27602);
    this.title = paramString;
    this.ujm = true;
    GMTrace.o(3704677728256L, 27602);
    return this;
  }
  
  public final tz Ri(String paramString)
  {
    GMTrace.i(3704811945984L, 27603);
    this.desc = paramString;
    this.ujn = true;
    GMTrace.o(3704811945984L, 27603);
    return this;
  }
  
  public final tz Rj(String paramString)
  {
    GMTrace.i(3704946163712L, 27604);
    this.thumbUrl = paramString;
    this.ulw = true;
    GMTrace.o(3704946163712L, 27604);
    return this;
  }
  
  public final tz Rk(String paramString)
  {
    GMTrace.i(3705080381440L, 27605);
    this.info = paramString;
    this.ulx = true;
    GMTrace.o(3705080381440L, 27605);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3705214599168L, 27606);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.thumbUrl != null) {
        paramVarArgs.e(3, this.thumbUrl);
      }
      if (this.info != null) {
        paramVarArgs.e(4, this.info);
      }
      GMTrace.o(3705214599168L, 27606);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label458;
      }
    }
    label458:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.thumbUrl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.thumbUrl);
      }
      paramInt = i;
      if (this.info != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.info);
      }
      GMTrace.o(3705214599168L, 27606);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3705214599168L, 27606);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tz localtz = (tz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3705214599168L, 27606);
          return -1;
        case 1: 
          localtz.title = locala.yqV.readString();
          localtz.ujm = true;
          GMTrace.o(3705214599168L, 27606);
          return 0;
        case 2: 
          localtz.desc = locala.yqV.readString();
          localtz.ujn = true;
          GMTrace.o(3705214599168L, 27606);
          return 0;
        case 3: 
          localtz.thumbUrl = locala.yqV.readString();
          localtz.ulw = true;
          GMTrace.o(3705214599168L, 27606);
          return 0;
        }
        localtz.info = locala.yqV.readString();
        localtz.ulx = true;
        GMTrace.o(3705214599168L, 27606);
        return 0;
      }
      GMTrace.o(3705214599168L, 27606);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */