package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ts
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String info;
  public String thumbUrl;
  public String title;
  public int type;
  public boolean ujm;
  public boolean ujn;
  public boolean ulw;
  public boolean ulx;
  public boolean uly;
  
  public ts()
  {
    GMTrace.i(3698503712768L, 27556);
    this.ujm = false;
    this.ujn = false;
    this.ulw = false;
    this.ulx = false;
    this.uly = false;
    GMTrace.o(3698503712768L, 27556);
  }
  
  public final ts QR(String paramString)
  {
    GMTrace.i(3698637930496L, 27557);
    this.title = paramString;
    this.ujm = true;
    GMTrace.o(3698637930496L, 27557);
    return this;
  }
  
  public final ts QS(String paramString)
  {
    GMTrace.i(3698772148224L, 27558);
    this.desc = paramString;
    this.ujn = true;
    GMTrace.o(3698772148224L, 27558);
    return this;
  }
  
  public final ts QT(String paramString)
  {
    GMTrace.i(3698906365952L, 27559);
    this.thumbUrl = paramString;
    this.ulw = true;
    GMTrace.o(3698906365952L, 27559);
    return this;
  }
  
  public final ts QU(String paramString)
  {
    GMTrace.i(3699040583680L, 27560);
    this.info = paramString;
    this.ulx = true;
    GMTrace.o(3699040583680L, 27560);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3699309019136L, 27562);
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
      if (this.uly == true) {
        paramVarArgs.fk(5, this.type);
      }
      GMTrace.o(3699309019136L, 27562);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label532;
      }
    }
    label532:
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
      i = paramInt;
      if (this.uly == true) {
        i = paramInt + b.a.a.a.fh(5, this.type);
      }
      GMTrace.o(3699309019136L, 27562);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3699309019136L, 27562);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ts localts = (ts)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3699309019136L, 27562);
          return -1;
        case 1: 
          localts.title = locala.yqV.readString();
          localts.ujm = true;
          GMTrace.o(3699309019136L, 27562);
          return 0;
        case 2: 
          localts.desc = locala.yqV.readString();
          localts.ujn = true;
          GMTrace.o(3699309019136L, 27562);
          return 0;
        case 3: 
          localts.thumbUrl = locala.yqV.readString();
          localts.ulw = true;
          GMTrace.o(3699309019136L, 27562);
          return 0;
        case 4: 
          localts.info = locala.yqV.readString();
          localts.ulx = true;
          GMTrace.o(3699309019136L, 27562);
          return 0;
        }
        localts.type = locala.yqV.nj();
        localts.uly = true;
        GMTrace.o(3699309019136L, 27562);
        return 0;
      }
      GMTrace.o(3699309019136L, 27562);
      return -1;
    }
  }
  
  public final ts zW(int paramInt)
  {
    GMTrace.i(3699174801408L, 27561);
    this.type = paramInt;
    this.uly = true;
    GMTrace.o(3699174801408L, 27561);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */