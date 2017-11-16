package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class uf
  extends com.tencent.mm.bm.a
{
  public String canvasPageXml;
  public String desc;
  public int giA;
  public String thumbUrl;
  public String title;
  public boolean ujm;
  public boolean ujn;
  public boolean uky;
  public boolean ulw;
  public String umf;
  public boolean umg;
  public int umh;
  public boolean umi;
  public boolean umj;
  
  public uf()
  {
    GMTrace.i(3650453766144L, 27198);
    this.ujm = false;
    this.ujn = false;
    this.umg = false;
    this.ulw = false;
    this.umi = false;
    this.umj = false;
    this.uky = false;
    GMTrace.o(3650453766144L, 27198);
  }
  
  public final uf Aa(int paramInt)
  {
    GMTrace.i(3651124854784L, 27203);
    this.umh = paramInt;
    this.umi = true;
    GMTrace.o(3651124854784L, 27203);
    return this;
  }
  
  public final uf Ab(int paramInt)
  {
    GMTrace.i(3651259072512L, 27204);
    this.giA = paramInt;
    this.umj = true;
    GMTrace.o(3651259072512L, 27204);
    return this;
  }
  
  public final uf Rl(String paramString)
  {
    GMTrace.i(3650587983872L, 27199);
    this.title = paramString;
    this.ujm = true;
    GMTrace.o(3650587983872L, 27199);
    return this;
  }
  
  public final uf Rm(String paramString)
  {
    GMTrace.i(3650722201600L, 27200);
    this.desc = paramString;
    this.ujn = true;
    GMTrace.o(3650722201600L, 27200);
    return this;
  }
  
  public final uf Rn(String paramString)
  {
    GMTrace.i(3650856419328L, 27201);
    this.umf = paramString;
    this.umg = true;
    GMTrace.o(3650856419328L, 27201);
    return this;
  }
  
  public final uf Ro(String paramString)
  {
    GMTrace.i(3650990637056L, 27202);
    this.thumbUrl = paramString;
    this.ulw = true;
    GMTrace.o(3650990637056L, 27202);
    return this;
  }
  
  public final uf Rp(String paramString)
  {
    GMTrace.i(3651393290240L, 27205);
    this.canvasPageXml = paramString;
    this.uky = true;
    GMTrace.o(3651393290240L, 27205);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3651527507968L, 27206);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.umf != null) {
        paramVarArgs.e(3, this.umf);
      }
      if (this.thumbUrl != null) {
        paramVarArgs.e(4, this.thumbUrl);
      }
      if (this.umi == true) {
        paramVarArgs.fk(5, this.umh);
      }
      if (this.umj == true) {
        paramVarArgs.fk(6, this.giA);
      }
      if (this.canvasPageXml != null) {
        paramVarArgs.e(7, this.canvasPageXml);
      }
      GMTrace.o(3651527507968L, 27206);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label676;
      }
    }
    label676:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.umf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.umf);
      }
      paramInt = i;
      if (this.thumbUrl != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.thumbUrl);
      }
      i = paramInt;
      if (this.umi == true) {
        i = paramInt + b.a.a.a.fh(5, this.umh);
      }
      paramInt = i;
      if (this.umj == true) {
        paramInt = i + b.a.a.a.fh(6, this.giA);
      }
      i = paramInt;
      if (this.canvasPageXml != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.canvasPageXml);
      }
      GMTrace.o(3651527507968L, 27206);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3651527507968L, 27206);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        uf localuf = (uf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3651527507968L, 27206);
          return -1;
        case 1: 
          localuf.title = locala.yqV.readString();
          localuf.ujm = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        case 2: 
          localuf.desc = locala.yqV.readString();
          localuf.ujn = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        case 3: 
          localuf.umf = locala.yqV.readString();
          localuf.umg = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        case 4: 
          localuf.thumbUrl = locala.yqV.readString();
          localuf.ulw = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        case 5: 
          localuf.umh = locala.yqV.nj();
          localuf.umi = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        case 6: 
          localuf.giA = locala.yqV.nj();
          localuf.umj = true;
          GMTrace.o(3651527507968L, 27206);
          return 0;
        }
        localuf.canvasPageXml = locala.yqV.readString();
        localuf.uky = true;
        GMTrace.o(3651527507968L, 27206);
        return 0;
      }
      GMTrace.o(3651527507968L, 27206);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */