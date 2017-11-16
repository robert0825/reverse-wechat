package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class g
{
  public static final g akA = a('\000', 'ӹ').a(c('־')).a(a('א', 'ת')).a(c('׳')).a(c('״')).a(a('؀', 'ۿ')).a(a('ݐ', 'ݿ')).a(a('฀', '๿')).a(a('Ḁ', '₯')).a(a('℀', '℺')).a(a(64336, 65023)).a(a(65136, 65279)).a(a(65377, 65500));
  public static final g akB = new g()
  {
    public final g a(g paramAnonymousg)
    {
      w.aa(paramAnonymousg);
      return this;
    }
    
    public final boolean d(char paramAnonymousChar)
    {
      return true;
    }
    
    public final boolean l(CharSequence paramAnonymousCharSequence)
    {
      w.aa(paramAnonymousCharSequence);
      return true;
    }
  };
  public static final g akC = new g()
  {
    public final g a(g paramAnonymousg)
    {
      return (g)w.aa(paramAnonymousg);
    }
    
    public final boolean d(char paramAnonymousChar)
    {
      return false;
    }
    
    public final boolean l(CharSequence paramAnonymousCharSequence)
    {
      return paramAnonymousCharSequence.length() == 0;
    }
  };
  public static final g ako = k("\t\n\013\f\r     　 ᠎ ").a(a(' ', ' '));
  public static final g akp = k("\t\n\013\f\r     　").a(a(' ', ' ')).a(a(' ', ' '));
  public static final g akq = a('\000', '');
  public static final g akr;
  public static final g aks;
  public static final g akt;
  public static final g aku;
  public static final g akv;
  public static final g akw;
  public static final g akx;
  public static final g aky;
  public static final g akz;
  
  static
  {
    g localg = a('0', '9');
    char[] arrayOfChar = "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray();
    int j = arrayOfChar.length;
    int i = 0;
    while (i < j)
    {
      char c = arrayOfChar[i];
      localg = localg.a(a(c, (char)(c + '\t')));
      i += 1;
    }
    akr = localg;
    aks = a('\t', '\r').a(a('\034', ' ')).a(c(' ')).a(c('᠎')).a(a(' ', ' ')).a(a(' ', '​')).a(a(' ', ' ')).a(c(' ')).a(c('　'));
    akt = new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return Character.isDigit(paramAnonymousChar);
      }
    };
    aku = new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return Character.isLetter(paramAnonymousChar);
      }
    };
    akv = new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return Character.isLetterOrDigit(paramAnonymousChar);
      }
    };
    akw = new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return Character.isUpperCase(paramAnonymousChar);
      }
    };
    akx = new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return Character.isLowerCase(paramAnonymousChar);
      }
    };
    aky = a('\000', '\037').a(a('', ''));
    akz = a('\000', ' ').a(a('', ' ')).a(c('­')).a(a('؀', '؃')).a(k("۝܏ ឴឵᠎")).a(a(' ', '‏')).a(a(' ', ' ')).a(a(' ', '⁤')).a(a('⁪', '⁯')).a(c('　')).a(a(55296, 63743)).a(k("﻿￹￺￻"));
  }
  
  private static g a(char paramChar1, final char paramChar2)
  {
    if (paramChar2 >= paramChar1) {}
    for (boolean bool = true;; bool = false)
    {
      w.af(bool);
      new g()
      {
        public final boolean d(char paramAnonymousChar)
        {
          return (this.akH <= paramAnonymousChar) && (paramAnonymousChar <= paramChar2);
        }
      };
    }
  }
  
  private static g c(char paramChar)
  {
    new g()
    {
      public final g a(g paramAnonymousg)
      {
        if (paramAnonymousg.d(this.akD)) {
          return paramAnonymousg;
        }
        return super.a(paramAnonymousg);
      }
      
      public final boolean d(char paramAnonymousChar)
      {
        return paramAnonymousChar == this.akD;
      }
    };
  }
  
  private static g k(CharSequence paramCharSequence)
  {
    switch (paramCharSequence.length())
    {
    default: 
      paramCharSequence = paramCharSequence.toString().toCharArray();
      Arrays.sort(paramCharSequence);
      new g()
      {
        public final boolean d(char paramAnonymousChar)
        {
          return Arrays.binarySearch(this.akG, paramAnonymousChar) >= 0;
        }
      };
    case 0: 
      return akC;
    case 1: 
      return c(paramCharSequence.charAt(0));
    }
    new g()
    {
      public final boolean d(char paramAnonymousChar)
      {
        return (paramAnonymousChar == this.akE) || (paramAnonymousChar == this.akF);
      }
    };
  }
  
  public g a(g paramg)
  {
    return new a(Arrays.asList(new g[] { this, (g)w.aa(paramg) }));
  }
  
  public abstract boolean d(char paramChar);
  
  public boolean l(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length() - 1;
    while (i >= 0)
    {
      if (!d(paramCharSequence.charAt(i))) {
        return false;
      }
      i -= 1;
    }
    return true;
  }
  
  private static final class a
    extends g
  {
    List<g> akJ;
    
    a(List<g> paramList)
    {
      this.akJ = paramList;
    }
    
    public final g a(g paramg)
    {
      ArrayList localArrayList = new ArrayList(this.akJ);
      localArrayList.add(w.aa(paramg));
      return new a(localArrayList);
    }
    
    public final boolean d(char paramChar)
    {
      Iterator localIterator = this.akJ.iterator();
      while (localIterator.hasNext()) {
        if (((g)localIterator.next()).d(paramChar)) {
          return true;
        }
      }
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\internal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */